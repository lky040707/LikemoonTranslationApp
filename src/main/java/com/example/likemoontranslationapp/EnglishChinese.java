
package com.example.likemoontranslationapp;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * <a href="http://www.webxml.com.cn/" target="_blank">WebXml.com.cn</a> <strong>����&lt;-&gt;Ӣ��˫����WEB�����������</strong>���ṩ�ʵ䷭�롢���꣨ƴ���������͡���ش��������䡢������Ӣ��Only������ѡ�ʵȹ��ܡ�</br>�������Ĳ�����ʹ��UTF-8���룬ʹ�ñ�վWEB������ע�������ӱ�վ��http://www.webxml.com.cn/ ��л��ҵ�֧�֣�<br /><br /><img alt="Ject.cn" title="www.Ject.cn" src="http://www.ject.cn/images/ject_logo_1616.gif" style="vertical-align: middle;" /> <a href="http://www.ject.cn/" target="_blank">��Ӣ��˫������վ <img alt="Zip" title="Zip file" src="http://www.ject.cn/images/icon/zip.gif" style="vertical-align: middle;" /> .Netʵ������</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img alt="PDF" title="PDF file" src="http://www.ject.cn/images/icon/pdf.gif" style="vertical-align: middle;" /> <a href="http://fy.webxml.com.cn/files/TranslatorWebServiceHelp.pdf" target="_blank">�ӿڿ��������ĵ�</a><br /><br />&nbsp;
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "EnglishChinese", targetNamespace = "http://WebXml.com.cn/", wsdlLocation = "file:/D:/\u5b66\u6821/\u4e13\u4e1a\u8bfe/\u8f6f\u4ef6\u4f53\u7cfb\u7ed3\u6784/\u5b9e\u9a8c\u56db/LikemoonTranslationApp/src/wsdl/EnglishChinese.wsdl")
public class EnglishChinese
    extends Service
{

    private final static URL ENGLISHCHINESE_WSDL_LOCATION;
    private final static WebServiceException ENGLISHCHINESE_EXCEPTION;
    private final static QName ENGLISHCHINESE_QNAME = new QName("http://WebXml.com.cn/", "EnglishChinese");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/D:/\u5b66\u6821/\u4e13\u4e1a\u8bfe/\u8f6f\u4ef6\u4f53\u7cfb\u7ed3\u6784/\u5b9e\u9a8c\u56db/LikemoonTranslationApp/src/wsdl/EnglishChinese.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ENGLISHCHINESE_WSDL_LOCATION = url;
        ENGLISHCHINESE_EXCEPTION = e;
    }

    public EnglishChinese() {
        super(__getWsdlLocation(), ENGLISHCHINESE_QNAME);
    }

    public EnglishChinese(WebServiceFeature... features) {
        super(__getWsdlLocation(), ENGLISHCHINESE_QNAME, features);
    }

    public EnglishChinese(URL wsdlLocation) {
        super(wsdlLocation, ENGLISHCHINESE_QNAME);
    }

    public EnglishChinese(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ENGLISHCHINESE_QNAME, features);
    }

    public EnglishChinese(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EnglishChinese(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns EnglishChineseSoap
     */
    @WebEndpoint(name = "EnglishChineseSoap")
    public EnglishChineseSoap getEnglishChineseSoap() {
        return super.getPort(new QName("http://WebXml.com.cn/", "EnglishChineseSoap"), EnglishChineseSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EnglishChineseSoap
     */
    @WebEndpoint(name = "EnglishChineseSoap")
    public EnglishChineseSoap getEnglishChineseSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://WebXml.com.cn/", "EnglishChineseSoap"), EnglishChineseSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ENGLISHCHINESE_EXCEPTION!= null) {
            throw ENGLISHCHINESE_EXCEPTION;
        }
        return ENGLISHCHINESE_WSDL_LOCATION;
    }

}
