<%@ Page Title="Contact" Language="C#" MasterPageFile="~/Site.Master" AutoEventWireup="true" CodeBehind="Contact.aspx.cs" Inherits="Sistema_Bancario.Contact" %>

<asp:Content ID="BodyContent" ContentPlaceHolderID="MainContent" runat="server">
    <h2><%: Title %>¿Eres nuevo? Registrate</h2>
    <h3>Datos de Cliente
    </h3>
    <address>
        
        
        
        <asp:Table ID="Table1" runat="server" Width="296px"
            HorizontalAlign="Center">
            
            <asp:TableRow 
                ID="TableRow1" 
                runat="server" 
                
                >
                <asp:TableCell>DPI</asp:TableCell>
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
                <asp:TableCell
                    HorizontalAlign="Center">
                    <asp:Calendar ID="Calendar1" runat="server" BackColor="White" BorderColor="#3366CC" BorderWidth="1px" CellPadding="1" DayNameFormat="Shortest" Font-Names="Verdana" Font-Size="8pt" ForeColor="#003399" Height="22px" Width="148px">
        <DayHeaderStyle BackColor="#99CCCC" ForeColor="#336666" Height="1px" />
        <NextPrevStyle Font-Size="8pt" ForeColor="#CCCCFF" />
        <OtherMonthDayStyle ForeColor="#999999" />
        <SelectedDayStyle BackColor="#009999" Font-Bold="True" ForeColor="#CCFF99" />
        <SelectorStyle BackColor="#99CCCC" ForeColor="#336666" />
        <TitleStyle BackColor="#003399" BorderColor="#3366CC" BorderWidth="1px" Font-Bold="True" Font-Size="10pt" ForeColor="#CCCCFF" Height="25px" />
        <TodayDayStyle BackColor="#99CCCC" ForeColor="White" />
        <WeekendDayStyle BackColor="#CCCCFF" />
        </asp:Calendar></asp:TableCell>
                
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
        
        
        
      
        
    </address>

    <address>
        <strong>Support:</strong>   <a href="mailto:Support@example.com">Support@example.com</a><br />
        <strong>Marketing:</strong> <a href="mailto:Marketing@example.com">Marketing@example.com</a>
    </address>
</asp:Content>
