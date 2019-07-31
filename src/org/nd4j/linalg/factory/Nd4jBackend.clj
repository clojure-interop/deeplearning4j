(ns org.nd4j.linalg.factory.Nd4jBackend
  "An ND4j backend.
 A \"backend\" is also described here: http://nd4j.org/backend.html
 A backend also has 2 variables to be aware of.
 1 is the environment variable, ND4J_DYNAMIC_LOAD_CLASSPATH
 This will define a uri path separated by ; where jars will be
 loaded from the path and dynamically loaded.
 The other is the system property:
 org.nd4j.backend.dynamicbackend
 This has the same use case but is for system properties.
 Of note here is that the system property takes loading precedence over
 the environment variable. If you want to just use the environment variable,
 don't define the system property.
 Both of these variables are for dynamically loading a backend relative to a path.
 The main idea here is for distributed environments like spark where
 you have multiple worker nodes with some having gpus and others not.
 When you define an environment variable on the server, you can
 have a hardware jar file load with respect to the node nd4j is installed on.
 The system property is mainly for flexibility and probably shouldn't be
 used in practice."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.factory Nd4jBackend]))

(defn ->nd-4j-backend
  "Constructor."
  (^Nd4jBackend []
    (new Nd4jBackend )))

(def *-backend-priority-cpu
  "Static Constant.

  type: int"
  Nd4jBackend/BACKEND_PRIORITY_CPU)

(def *-backend-priority-gpu
  "Static Constant.

  type: int"
  Nd4jBackend/BACKEND_PRIORITY_GPU)

(def *-dynamic-load-classpath
  "Static Constant.

  Deprecated. Use ND4JEnvironmentVars.BACKEND_DYNAMIC_LOAD_CLASSPATH

  type: java.lang.String"
  Nd4jBackend/DYNAMIC_LOAD_CLASSPATH)

(def *-dynamic-load-classpath-property
  "Static Constant.

  Deprecated. Use ND4JSystemProperties.DYNAMIC_LOAD_CLASSPATH_PROPERTY

  type: java.lang.String"
  Nd4jBackend/DYNAMIC_LOAD_CLASSPATH_PROPERTY)

(defn *load
  "Loads the best available backend.

  returns: `org.nd4j.linalg.factory.Nd4jBackend`

  throws: org.nd4j.linalg.factory.Nd4jBackend$NoAvailableBackendException"
  (^org.nd4j.linalg.factory.Nd4jBackend []
    (Nd4jBackend/load )))

(defn *load-library
  "Adds the supplied Java Archive library to java.class.path. This is benign
  if the library is already loaded.

  jar - the jar file to add - `java.io.File`

  throws: org.nd4j.linalg.factory.Nd4jBackend$NoAvailableBackendException"
  ([^java.io.File jar]
    (Nd4jBackend/loadLibrary jar)))

(defn get-nd-array-class
  "Get the actual (concrete/implementation) class for standard INDArrays for this backend

  returns: `java.lang.Class`"
  (^java.lang.Class [^Nd4jBackend this]
    (-> this (.getNDArrayClass))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Nd4jBackend this]
    (-> this (.toString))))

(defn get-configuration-resource
  "Get the configuration resource

  returns: `org.nd4j.linalg.io.Resource`"
  (^org.nd4j.linalg.io.Resource [^Nd4jBackend this]
    (-> this (.getConfigurationResource))))

(defn get-properties
  "returns: `java.util.Properties`

  throws: java.io.IOException"
  (^java.util.Properties [^Nd4jBackend this]
    (-> this (.getProperties))))

(defn allows-order
  "Returns true if the
  backend allows order to be specified
  on blas operations (cblas)

  returns: true if the backend allows
  order to be specified on blas operations - `boolean`"
  (^Boolean [^Nd4jBackend this]
    (-> this (.allowsOrder))))

(defn can-run?
  "Returns true if the backend can
  run on the os or not

  returns: `boolean`"
  (^Boolean [^Nd4jBackend this]
    (-> this (.canRun))))

(defn get-context
  "returns: `org.nd4j.context.Nd4jContext`

  throws: java.io.IOException"
  (^org.nd4j.context.Nd4jContext [^Nd4jBackend this]
    (-> this (.getContext))))

(defn available?
  "Determines whether a given backend is available in the current environment.

  returns: true if the backend is available; false otherwise. - `boolean`"
  (^Boolean [^Nd4jBackend this]
    (-> this (.isAvailable))))

(defn get-priority
  "Gets a priority number for the backend.
  Backends are loaded in priority order (highest first).

  returns: a priority number. - `int`"
  (^Integer [^Nd4jBackend this]
    (-> this (.getPriority))))

