(ns org.deeplearning4j.common.resources.DL4JResources
  "DL4JResources controls the local storage locations for models and datasets that are downloaded and stored locally.
 The storage location is customizable in 2 ways:
 (a) via the DL4J_RESOURCES_DIR_PROPERTY system property, org.deeplearning4j.resources.directory
 (b) By calling setBaseDirectory(File) at runtime"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.common.resources DL4JResources]))

(defn ->dl-4-j-resources
  "Constructor."
  (^DL4JResources []
    (new DL4JResources )))

(def *-dl-4-j-resources-dir-property
  "Static Constant.

  Deprecated. Use DL4JSystemProperties.DL4J_RESOURCES_DIR_PROPERTY

  type: java.lang.String"
  DL4JResources/DL4J_RESOURCES_DIR_PROPERTY)

(def *-dl-4-j-base-url-property
  "Static Constant.

  Deprecated. Use DL4JSystemProperties.DL4J_RESOURCES_BASE_URL_PROPERTY

  type: java.lang.String"
  DL4JResources/DL4J_BASE_URL_PROPERTY)

(defn *set-base-download-url
  "Set the base download URL for (most) DL4J datasets and models.
  This usually doesn't need to be set manually unless there is some issue with the default location

  base-download-url - Base download URL to set. For example, http://blob.deeplearning4j.org/ - `java.lang.String`"
  ([^java.lang.String base-download-url]
    (DL4JResources/setBaseDownloadURL base-download-url)))

(defn *get-base-download-url
  "returns: The base URL hosting DL4J datasets and models - `java.lang.String`"
  (^java.lang.String []
    (DL4JResources/getBaseDownloadURL )))

(defn *get-url
  "Get the URL relative to the base URL.
  For example, if baseURL is \"http://blob.deeplearning4j.org/\", and relativeToBase is \"/datasets/iris.dat\"
  this simply returns \"http://blob.deeplearning4j.org/datasets/iris.dat\"

  relative-to-base - Relative URL - `java.lang.String`

  returns: URL - `java.net.URL`

  throws: java.net.MalformedURLException - For bad URL"
  (^java.net.URL [^java.lang.String relative-to-base]
    (DL4JResources/getURL relative-to-base)))

(defn *get-url-string
  "Get the URL relative to the base URL as a String.
  For example, if baseURL is \"http://blob.deeplearning4j.org/\", and relativeToBase is \"/datasets/iris.dat\"
  this simply returns \"http://blob.deeplearning4j.org/datasets/iris.dat\"

  relative-to-base - Relative URL - `java.lang.String`

  returns: URL - `java.lang.String`

  throws: java.net.MalformedURLException - For bad URL"
  (^java.lang.String [^java.lang.String relative-to-base]
    (DL4JResources/getURLString relative-to-base)))

(defn *reset-base-directory-location
  "Reset to the default directory, or the directory set via the DL4JSystemProperties.DL4J_RESOURCES_DIR_PROPERTY system property,
  org.deeplearning4j.resources.directory"
  ([]
    (DL4JResources/resetBaseDirectoryLocation )))

(defn *set-base-directory
  "Set the base directory for local storage of files. Default is: new File(System.getProperty(\"user.home\"), \".deeplearning4j\")

  f - Base directory to use for resources - `java.io.File`"
  ([^java.io.File f]
    (DL4JResources/setBaseDirectory f)))

(defn *get-base-directory
  "returns: The base storage directory for DL4J resources - `java.io.File`"
  (^java.io.File []
    (DL4JResources/getBaseDirectory )))

(defn *get-directory
  "Get the storage location for the specified resource type and resource name

  resource-type - Type of resource - `org.deeplearning4j.common.resources.ResourceType`
  resource-name - Name of the resource - `java.lang.String`

  returns: The root directory. Creates the directory and any parent directories, if required - `java.io.File`"
  (^java.io.File [^org.deeplearning4j.common.resources.ResourceType resource-type ^java.lang.String resource-name]
    (DL4JResources/getDirectory resource-type resource-name)))

