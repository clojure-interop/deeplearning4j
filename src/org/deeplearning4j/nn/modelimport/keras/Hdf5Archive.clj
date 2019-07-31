(ns org.deeplearning4j.nn.modelimport.keras.Hdf5Archive
  "Class for reading ND4J arrays and JSON strings from HDF5 archive files.
 HDF5 is really sensitive about the order its resources are deallocated in.
 Make sure to ALWAYS call close() explicitly or with try-with-resources,
 or it might decide to crash the JVM."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.modelimport.keras Hdf5Archive]))

(defn ->hdf-5-archive
  "Constructor.

  archive-filename - `java.lang.String`"
  (^Hdf5Archive [^java.lang.String archive-filename]
    (new Hdf5Archive archive-filename)))

(defn close
  ""
  ([^Hdf5Archive this]
    (-> this (.close))))

(defn read-data-set
  "Read data set as ND4J array from group path.

  dataset-name - Name of data set - `java.lang.String`
  groups - Array of zero or more ancestor groups from root to parent. - `java.lang.String`

  returns: INDArray of HDF5 group data - `org.nd4j.linalg.api.ndarray.INDArray`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.UnsupportedKerasConfigurationException - Unsupported Keras config"
  (^org.nd4j.linalg.api.ndarray.INDArray [^Hdf5Archive this ^java.lang.String dataset-name ^java.lang.String groups]
    (-> this (.readDataSet dataset-name groups))))

(defn read-attribute-as-json
  "Read JSON-formatted string attribute from group path.

  attribute-name - Name of attribute - `java.lang.String`
  groups - Array of zero or more ancestor groups from root to parent. - `java.lang.String`

  returns: HDF5 attribute as JSON - `java.lang.String`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.UnsupportedKerasConfigurationException - Unsupported Keras config"
  (^java.lang.String [^Hdf5Archive this ^java.lang.String attribute-name ^java.lang.String groups]
    (-> this (.readAttributeAsJson attribute-name groups))))

(defn read-attribute-as-string
  "Read string attribute from group path.

  attribute-name - Name of attribute - `java.lang.String`
  groups - Array of zero or more ancestor groups from root to parent. - `java.lang.String`

  returns: HDF5 attribute as String - `java.lang.String`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.UnsupportedKerasConfigurationException - Unsupported Keras config"
  (^java.lang.String [^Hdf5Archive this ^java.lang.String attribute-name ^java.lang.String groups]
    (-> this (.readAttributeAsString attribute-name groups))))

(defn has-attribute?
  "Check whether group path contains string attribute.

  attribute-name - Name of attribute - `java.lang.String`
  groups - Array of zero or more ancestor groups from root to parent. - `java.lang.String`

  returns: Boolean indicating whether attribute exists in group path. - `boolean`"
  (^Boolean [^Hdf5Archive this ^java.lang.String attribute-name ^java.lang.String groups]
    (-> this (.hasAttribute attribute-name groups))))

(defn get-data-sets
  "Get list of data sets from group path.

  groups - Array of zero or more ancestor groups from root to parent. - `java.lang.String`

  returns: List of HDF5 data set names - `java.util.List<java.lang.String>`"
  (^java.util.List [^Hdf5Archive this ^java.lang.String groups]
    (-> this (.getDataSets groups))))

(defn get-groups
  "Get list of groups from group path.

  groups - Array of zero or more ancestor groups from root to parent. - `java.lang.String`

  returns: List of HDF5 groups - `java.util.List<java.lang.String>`"
  (^java.util.List [^Hdf5Archive this ^java.lang.String groups]
    (-> this (.getGroups groups))))

(defn read-attribute-as-fixed-length-string
  "Read string attribute from group path.

  attribute-name - Name of attribute - `java.lang.String`
  buffer-size - buffer size to read - `int`

  returns: Fixed-length string read from HDF5 attribute name - `java.lang.String`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.UnsupportedKerasConfigurationException - Unsupported Keras config"
  (^java.lang.String [^Hdf5Archive this ^java.lang.String attribute-name ^Integer buffer-size]
    (-> this (.readAttributeAsFixedLengthString attribute-name buffer-size))))

