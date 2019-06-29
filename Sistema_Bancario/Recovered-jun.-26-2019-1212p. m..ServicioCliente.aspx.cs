using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace Sistema_Bancario
{
    public partial class ServicioCliente : System.Web.UI.Page
    {
        DataSet2 dataSetIdeal = new DataSet2();
        DataSet2TableAdapters.SERVICIO_CLIENTETableAdapter servicioTableAdapter = new DataSet2TableAdapters.SERVICIO_CLIENTETableAdapter();
       System.Data.SqlClient.SqlConnection conexion = new SqlConnection("Data Source=TOSHIBA_55\\SQLEXPRESS;Initial Catalog=BD_BANCO;Integrated Security=True");

        Manejador manejador = new Manejador();
        protected void Page_Load(object sender, EventArgs e)
        {
            
            if (Session["pilaCliente"] != null)
            {
                manejador = (Manejador)Session["pilaCliente"];
                foreach (var item in manejador.pilaCliente)
                {
                    
                    CmbSolicitudes.Items.Add(item.getTicket().ToString());
             
                }
            }
            else
            {
                //
                Response.Write("<script>alert('No hay Solicitudes por procesar')</script>");
            }
            //Solicitudes();
        }

        public void Solicitudes() {
            foreach (var item in manejador.pilaCliente) {
                CmbSolicitudes.Items.Add(item.getTicket().ToString());
               
            }
        }
        protected void Button2_Click(object sender, EventArgs e)
        {

            if (Session["pilaCliente"]!=null)
            {
                
                manejador = (Manejador)Session["pilaCliente"];
                
                foreach (var item in manejador.pilaCliente)
                {
                    SqlCommand comando = new SqlCommand("INSERT INTO SERVICIO_CLIENTE(descripcion,cod_cliente,cod_empleado,cod_estado,ticket) VALUES('"+item.getDescripcion()+"',"+item.getCod_clienteo()+","+txtCodCajero.Text+","+2+","+item.getTicket()+")",conexion);
                    conexion.Open();
                    comando.ExecuteNonQuery();
                    conexion.Close();
                }
                Response.Write("<script>alert('Solicitud Procesada')</script>");

            }
            else{
                Response.Write("<script>alert('No hay informacion para Guardar')</script>");
            }

        }

        protected void Button3_Click(object sender, EventArgs e)
        {
            Response.Redirect("Cajero.aspx");
        }

        protected void CmbSolicitudes_SelectedIndexChanged(object sender, EventArgs e)
        {
        }
        protected void BtnProcesar_Click(object sender, EventArgs e)
        {

            if (Session["pilaCliente"] != null)
            {

                manejador = (Manejador)Session["pilaCliente"];

                foreach (var item in manejador.pilaCliente)
                {
                    if (CmbSolicitudes.SelectedItem.Equals(item.getTicket()))
                    {
                        txtClient.Text = 
                        txtCodCajero.Text = item.getCod_empleado().ToString();
                        txtDesc.Text = item.getDescripcion().ToString();
                        txtTicket.Text = item.getTicket().ToString();
                    }
                }
                //Response.Write("<script>alert('Solicitud Procesada')</script>");

            }
            else
            {
                Response.Write("<script>alert('No hay informacion para mostrar')</script>");
            }
        }

    }
}