package org.switchyard.deployment;

import org.apache.log4j.Logger;

import org.jboss.deployers.spi.DeploymentException;

import org.jboss.beans.metadata.spi.BeanMetaData;
import org.jboss.deployers.structure.spi.DeploymentUnit;
import org.jboss.deployers.spi.DeploymentException;
import org.jboss.deployers.spi.deployer.DeploymentStages;
import org.jboss.deployers.vfs.spi.deployer.AbstractSimpleVFSRealDeployer;
import org.jboss.deployers.vfs.spi.structure.VFSDeploymentUnit;

public class SwitchYardDeployer extends AbstractSimpleVFSRealDeployer<SwitchYardMetaData> {	
	
    /**
     * Logger.
     */
    private Logger log = Logger.getLogger(SwitchYardDeployer.class);
	
    /**
     * No args constructor.
     */
    public SwitchYardDeployer()
    {
        super(SwitchYardMetaData.class);	
        setOutput(BeanMetaData.class);
        setStage(DeploymentStages.POST_CLASSLOADER);
    }

    @Override
    public void deploy(VFSDeploymentUnit unit, SwitchYardMetaData metaData)
            throws DeploymentException {
    	try {

	        String fileName = unit.getSimpleName();
	        log.error(fileName);
	        log.error("SwitchyardDeployer!!!!");
	        log.error("SwitchyardDeployer!!!!");
	        log.error(fileName);
	        log.error("SwitchyardDeployer!!!!");
        } catch (Exception e) {
           throw DeploymentException.rethrowAsDeploymentException("Error creating switchyard deployment " + unit.getName(), e);
        }
    }
    
    public void undeploy(DeploymentUnit unit, SwitchYardMetaData metadata) {
    	System.out.println("UNDEPLOY Switchyard");
    }
}
