<%@ Page Title="" Language="C#" MasterPageFile="~/Site.Master" AutoEventWireup="true" CodeBehind="RegistroUsuario.aspx.cs" Inherits="Sistema_Bancario.RegistroUsuario" %>


<asp:Content ID="BodyContent" ContentPlaceHolderID="MainContent" runat="server">
    <h2><%: Title %>Registro de Empleado</h2>
    <h3>Datos de Empleado
    </h3>
    <address>
        
        
        
        <asp:Table ID="Table1" runat="server" Width="296px"
            HorizontalAlign="Center">
            
            <asp:TableRow 
                ID="TableRow1" 
                runat="server" 
                
                >
                <asp:TableCell>Rol</asp:TableCell>
                <asp:TableCell><asp:TextBox ID="txtDPI" runat="server" Width="220px"></asp:TextBox></asp:TableCell>
                
            </asp:TableRow>
            <asp:TableRow 
                ID="TableRow3" 
                runat="server" 
                
                >
                <asp:TableCell>Nombre</asp:TableCell>
                <asp:TableCell><asp:TextBox ID="txtNombre" runat="server" Width="220px"></asp:TextBox></asp:TableCell>
                
            </asp:TableRow>
            <asp:TableRow 
                ID="TableRow4" 
                runat="server" 
                
                >
                <asp:TableCell>Apellido</asp:TableCell>
                <asp:TableCell><asp:TextBox ID="txtApellido" runat="server" Width="220px"></asp:TextBox></asp:TableCell>
                
            </asp:TableRow>
            <asp:TableRow 
                ID="TableRow5" 
                runat="server" 
                
                >
                <asp:TableCell>Fecha Nac</asp:TableCell>
                
                <asp:TableCell><asp:TextBox ID="txtFecha" runat="server" Width="220px"></asp:TextBox></asp:TableCell>
                    
               
                
            </asp:TableRow>
            
            <asp:TableRow 
                ID="TableRow6" 
                runat="server" 
                
                >
                <asp:TableCell>Email</asp:TableCell>
                <asp:TableCell><asp:TextBox ID="txtEmail" runat="server" Width="220px"></asp:TextBox></asp:TableCell>
                
            </asp:TableRow>
            
            <asp:TableRow 
                ID="TableRow7" 
                runat="server" 
                
                >
                <asp:TableCell>Telefono</asp:TableCell>
                <asp:TableCell><asp:TextBox ID="txtTel" runat="server" Width="220px"></asp:TextBox></asp:TableCell>
                
            </asp:TableRow>
            <asp:TableRow 
                ID="TableRow8" 
                runat="server" 
                
                >
                <asp:TableCell>Usuario</asp:TableCell>
                <asp:TableCell><asp:TextBox ID="txtUsuario" runat="server" Width="220px"></asp:TextBox></asp:TableCell>
                
            </asp:TableRow>
            <asp:TableRow 
                ID="TableRow9" 
                runat="server" 
                
                >
                <asp:TableCell>Contraseña</asp:TableCell>
                <asp:TableCell><asp:TextBox ID="txtContra" runat="server" Width="220px"></asp:TextBox></asp:TableCell>
                
            </asp:TableRow>
             <asp:TableRow 
                ID="TableRow10" 
                runat="server" 
                
                >
                <asp:TableCell>CheckContra</asp:TableCell>
                <asp:TableCell><asp:TextBox ID="txtContra2" runat="server" Width="220px"></asp:TextBox></asp:TableCell>
                
            </asp:TableRow>

             <asp:TableRow 
                ID="TableRow11" 
                runat="server" 
                
                >
                <asp:TableCell>PalabraClave</asp:TableCell>
                <asp:TableCell><asp:TextBox ID="txtPalabra" runat="server" Width="220px"></asp:TextBox></asp:TableCell>
                
            </asp:TableRow>
             <asp:TableFooterRow 
                runat="server" 
                
                >
                <asp:TableCell 
                    ColumnSpan="3" 
                    HorizontalAlign="Center"
                    Font-Italic="true"
                    >
                      <asp:Button ID="BtnRegitrar" runat="server" OnClick="Button1_Click" Text="Registrarme" />
                </asp:TableCell>
            </asp:TableFooterRow>
          
        </asp:Table>
        
    </address>
    <address>
        
        
        
        &nbsp;</address>
    <address>
        
        
        
        &nbsp;</address>
    <address>
        
        
        
      
        
    </address>

    <address>
       
    </address>
</asp:Content>
