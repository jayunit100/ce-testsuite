package org.jboss.test.arquillian.ce.eap64;

import org.jboss.arquillian.ce.api.OpenShiftResource;
import org.jboss.arquillian.ce.api.Template;
import org.jboss.arquillian.ce.api.TemplateParameter;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.test.arquillian.ce.eap.common.EapPersistentTestBase;
import org.junit.runner.RunWith;

/**
 * @author Jonh Wendell
 */

@RunWith(Arquillian.class)
@Template(url = "https://raw.githubusercontent.com/jboss-openshift/application-templates/master/eap/eap64-postgresql-persistent-s2i.json", parameters = {
        @TemplateParameter(name = "HTTPS_NAME", value = "jboss"),
        @TemplateParameter(name = "HTTPS_PASSWORD", value = "mykeystorepass") })
@OpenShiftResource("classpath:eap-app-secret.json")
public class Eap64PostgresqlPersistentTest extends EapPersistentTestBase {

    @Override
    protected String[] getRCNames() {
        return new String[] {"eap-app-postgresql", "eap-app"};
    }
}
