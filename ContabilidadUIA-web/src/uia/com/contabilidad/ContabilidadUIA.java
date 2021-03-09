package uia.com.contabilidad;

import java.util.ArrayList;

import uia.com.contabilidad.clientes.InfoUIA;
import uia.com.contabilidad.gestor.DecoradorProveedores;
import uia.com.contabilidad.gestor.Gestor;
import uia.com.presentacion.ClienteJSP;

public class ContabilidadUIA {
		
		public DecoradorProveedores gestorProveedores = null;
		
		public ArrayList<ClienteJSP> listaProveedores = null;

		public ContabilidadUIA()
		{
		 Gestor contabilidad = new Gestor("C:\\TSU-UIA\\2021-P\\ContabilidadUIA-web\\ListaProveedores.json");		
		 DecoradorProveedores gestorProveedores = new DecoradorProveedores(contabilidad, "proveedor");		 
		 gestorProveedores.Print();
		 listaProveedores = gestorProveedores.getLista();
		}
		
		
		public ArrayList<ClienteJSP> getListaProveedores() {
			return listaProveedores;
		}



		public void setListaProveedores(ArrayList<ClienteJSP> listaProveedores) {
			this.listaProveedores = listaProveedores;
		}


		public DecoradorProveedores getGestorProveedores() {
			return gestorProveedores;
		}

		public void setGestorProveedores(DecoradorProveedores gestorProveedores) {
			this.gestorProveedores = gestorProveedores;
		}


}
