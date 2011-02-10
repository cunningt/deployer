package org.switchyard.deployment;

import java.net.URL;

import org.apache.log4j.Logger;

import org.jboss.beans.metadata.spi.BeanMetaData;
import org.jboss.deployers.client.spi.DeployerClient;
import org.jboss.deployers.structure.spi.DeploymentUnit;
import org.jboss.deployers.spi.DeploymentException;
import org.jboss.deployers.spi.deployer.DeploymentStages;
import org.jboss.deployers.spi.deployer.helpers.AbstractSimpleRealDeployer;
import org.jboss.deployers.vfs.spi.deployer.AbstractSimpleVFSRealDeployer;
import org.jboss.deployers.vfs.spi.structure.VFSDeploymentUnit;

public class SwitchyardDeployer extends AbstractSimpleRealDeployer<SwitchyardMetaData> {

    private DeployerClient mainDeployer;		

    /**
     * No args constructor.
     */
    public SwitchyardDeployer()
    {
        super(SwitchyardMetaData.class);
        System.out.println("SWITCHYARD.DEPLOYER");
        setOutput(BeanMetaData.class);
        //setStage(DeploymentStages.POST_CLASSLOADER);
    }

    public void setMainDeployer(DeployerClient mainDeployer)
    {
        this.mainDeployer = mainDeployer;
    }

    @Override
    public void deploy(DeploymentUnit unit, SwitchyardMetaData metaData)
            throws DeploymentException {
        String fileName = unit.getSimpleName();
        System.out.println("SwitchyardDeployer!!!!");
        log.error(fileName);
        log.error("SwitchyardDeployer!!!!");
        log.error("SwitchyardDeployer!!!!");
        log.error(fileName);
        log.error("SwitchyardDeployer!!!!");
        URL switchyardXMLURL = unit.getResourceLoader().getResource("switchyard.xml");
        if (switchyardXMLURL.toString() != null) {
        	log.error("FOUND switchyard.xml for fileName");
        }
    }
}
