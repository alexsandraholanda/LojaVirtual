<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset= UTF-8">

<title>Loja - Contato</title>

<link rel="stylesheet" type="text/css" href="CSS/loja.css">

</head>
<body>

		<div id= "topo">
			<h1>Loja Virtual</h1>
		</div>
		
		<div id="menu_lateral">
	        <ul>
	            <li><a href="index.jsp">Home</a></li>
	            <li><a href="produtos.jsp">Produtos</a></li>
	            <li><a href= "contato.jsp">Contato</a></li>
	            <li><a href= "cadastro.jsp">Cadastro</a></li>
	            
	            </ul>
	    </div>

	 <div> 
	 <font size="4" face="Times" color="#4B0082"> 
         <form action="Cadastro">
         	<h2>Cadastro</h2>
            Nome:      <input type="text" name="nome" /><br/>
            E-mail:    <input type="text" name="email" /><br/>
            Endereço:  <input type="text" name="endereco" /><br/>
            Data Nasc: <input type="text" name="dataNascimento" /><br /><br/>
    
           <input type="submit" value="Salvar" />
         </form>
      </font>   
     </div>
    	
    	<div id="rodape">
	        Todos os direitos reservados © 2020<br/>
	        Desenvolvido por Alexsandra Holanda
    	</div>

</body>
</html>