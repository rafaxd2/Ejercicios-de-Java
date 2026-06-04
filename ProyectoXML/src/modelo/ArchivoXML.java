package modelo;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.*;

public class ArchivoXML {

    private final String archivo = "huespedes.xml";

    public ArchivoXML() {

        try {

            File f = new File(archivo);

            if (!f.exists()) {

                DocumentBuilderFactory factory =
                        DocumentBuilderFactory.newInstance();

                DocumentBuilder builder =
                        factory.newDocumentBuilder();

                Document doc =
                        builder.newDocument();

                Element raiz =
                        doc.createElement("huespedes");

                doc.appendChild(raiz);

                guardarDocumento(doc);
            }

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    public void guardar(Huesped h) {

        try {

            Document doc = obtenerDocumento();

            Element raiz =
                    doc.getDocumentElement();

            Element huesped =
                    doc.createElement("huesped");

            Element id =
                    doc.createElement("id");

            id.appendChild(
                    doc.createTextNode(
                            String.valueOf(h.getId())));

            Element nombre =
                    doc.createElement("nombre");

            nombre.appendChild(
                    doc.createTextNode(
                            h.getNombre()));

            Element apellidos =
                    doc.createElement("apellidos");

            apellidos.appendChild(
                    doc.createTextNode(
                            h.getApellidos()));

            Element procedencia =
                    doc.createElement("procedencia");

            procedencia.appendChild(
                    doc.createTextNode(
                            h.getProcedencia()));

            huesped.appendChild(id);
            huesped.appendChild(nombre);
            huesped.appendChild(apellidos);
            huesped.appendChild(procedencia);

            raiz.appendChild(huesped);

            guardarDocumento(doc);

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    public String leer() {

        StringBuilder datos =
                new StringBuilder();

        try {

            Document doc =
                    obtenerDocumento();

            NodeList lista =
                    doc.getElementsByTagName("huesped");

            for (int i = 0; i < lista.getLength(); i++) {

                Element h =
                        (Element) lista.item(i);

                datos.append("ID: ")
                        .append(h.getElementsByTagName("id")
                                .item(0).getTextContent())
                        .append("\n");

                datos.append("Nombre: ")
                        .append(h.getElementsByTagName("nombre")
                                .item(0).getTextContent())
                        .append("\n");

                datos.append("Apellidos: ")
                        .append(h.getElementsByTagName("apellidos")
                                .item(0).getTextContent())
                        .append("\n");

                datos.append("Procedencia: ")
                        .append(h.getElementsByTagName("procedencia")
                                .item(0).getTextContent())
                        .append("\n");

                datos.append("----------------------\n");
            }

        } catch (Exception e) {

            e.printStackTrace();
        }

        return datos.toString();
    }

    private Document obtenerDocumento()
            throws Exception {

        DocumentBuilderFactory factory =
                DocumentBuilderFactory.newInstance();

        DocumentBuilder builder =
                factory.newDocumentBuilder();

        return builder.parse(
                new File(archivo));
    }

    private void guardarDocumento(Document doc)
            throws Exception {

        Transformer transformer =
                TransformerFactory.newInstance()
                        .newTransformer();

        DOMSource source =
                new DOMSource(doc);

        StreamResult result =
                new StreamResult(
                        new File(archivo));

        transformer.transform(source, result);
    }
}