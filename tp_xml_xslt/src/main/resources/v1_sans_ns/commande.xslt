<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" 
               xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
               xmlns:xsd="http://www.w3.org/2001/XMLSchema">
               
      <xsl:template match="/commande">
           <html>
              <body>
                      <h3><font color='red'><u> commande <xsl:value-of select="@num" /> </u></font></h3>                                   
                      <xsl:apply-templates select="client" />
                      <xsl:apply-templates select="produits" />           
              </body>
           </html>
      </xsl:template>
      
      <xsl:template match="client">
            <h5> <font color='blue'><u>client</u></font> </h5>
              <ul>
                <li>nom = <i><xsl:value-of select="nom" /></i></li>
                <li>prenom = <i><xsl:value-of select="prenom" /></i></li>
                <li>adresse = <i><xsl:value-of select="adresse" /></i></li>
               </ul>   
      </xsl:template>
      
      <xsl:template match="produits">
            <h5> <font color='blue'> <u>liste des produits</u></font> </h5><br/>
                 <table border='1'>  
                             <tr> <th> ref </th> <th> label </th> <th> prix </th>  <th> categorie </th></tr>                                          
                             <xsl:for-each select="produit">
                             <xsl:sort select="ref" order="ascending" data-type="number"/>
                             <xsl:element name='tr'>
                                  <xsl:attribute name='bgcolor'>
                                     <xsl:choose>
                                         <xsl:when test="position() mod 2 = 0">yellow</xsl:when> 
                                         <xsl:otherwise>green</xsl:otherwise>
                                     </xsl:choose>
                                  </xsl:attribute>
                                  <td> <xsl:value-of select="ref" /></td>
                                  <td> <xsl:value-of select="label" /></td>
                                  <td> <xsl:value-of select="prix" /></td>
                                  <td> <xsl:value-of select="@categorie" /></td>
                              </xsl:element>                              
                             </xsl:for-each> 
                             <tr><td>*</td><td>TOTAL</td>
                                  <td><xsl:value-of select="sum(produit/prix)" /></td>
                              </tr>
                 </table>
     
      </xsl:template>
               
</xsl:stylesheet>              