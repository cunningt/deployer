package org.switchyard.deployment;

import java.io.Serializable;
import java.util.Set;

import javax.management.ObjectName;

public class SwitchYardMetaData implements Serializable {
    /** Serial version unique identifier. */
    private static final long serialVersionUID = 0L;

    /** The name of the .esb archive. */
    private String _archiveName = null;

    /** The deployment name. The .esb archive name without the .esb suffix */
    private String _deploymentName = null;

    public SwitchYardMetaData(String archiveName, String deploymentName) {
    	_archiveName = archiveName;
    	_deploymentName = deploymentName;
    }
    
    /**
     * Gets the name of the archive that this metadata came from.
     *
     * @return String   The name of the archive that this metadata came from.
     */
    public final String getArchiveName()
    {
        return _archiveName;
    }

    /**
     * The deployment name is the name of the .esb archive without the .esb suffix.
     *
     * @return String The name of the deployment. This is the archive name without the .esb suffix.
     */
    public String getDeploymentName()
    {
        return _deploymentName;
    }
}
