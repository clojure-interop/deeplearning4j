(ns org.deeplearning4j.util.ModelSerializer
  "Utility class suited to save/restore neural net models"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.util ModelSerializer]))

(def *-updater-bin
  "Static Constant.

  type: java.lang.String"
  ModelSerializer/UPDATER_BIN)

(def *-normalizer-bin
  "Static Constant.

  type: java.lang.String"
  ModelSerializer/NORMALIZER_BIN)

(def *-configuration-json
  "Static Constant.

  type: java.lang.String"
  ModelSerializer/CONFIGURATION_JSON)

(def *-coefficients-bin
  "Static Constant.

  type: java.lang.String"
  ModelSerializer/COEFFICIENTS_BIN)

(def *-no-params-marker
  "Static Constant.

  type: java.lang.String"
  ModelSerializer/NO_PARAMS_MARKER)

(def *-preprocessor-bin
  "Static Constant.

  type: java.lang.String"
  ModelSerializer/PREPROCESSOR_BIN)

(defn *restore-multi-layer-network
  "Load a multi layer network from a file

  file - the file to load from - `java.io.File`
  load-updater - `boolean`

  returns: the loaded multi layer network - `org.deeplearning4j.nn.multilayer.MultiLayerNetwork`

  throws: java.io.IOException"
  (^org.deeplearning4j.nn.multilayer.MultiLayerNetwork [^java.io.File file ^Boolean load-updater]
    (ModelSerializer/restoreMultiLayerNetwork file load-updater))
  (^org.deeplearning4j.nn.multilayer.MultiLayerNetwork [^java.io.File file]
    (ModelSerializer/restoreMultiLayerNetwork file)))

(defn *get-object-from-file
  "Get an object with the specified key from the model file, that was previously added to the file using
  addObjectToFile(File, String, Object)

  f - model file to add the object to - `java.io.File`
  key - Key for the object - `java.lang.String`

  returns: The serialized object - `<T> T`"
  ([^java.io.File f ^java.lang.String key]
    (ModelSerializer/getObjectFromFile f key)))

(defn *restore-multi-layer-network-and-normalizer
  "Restore a MultiLayerNetwork and Normalizer (if present - null if not) from the InputStream.
  Note: the input stream is read fully and closed by this method. Consequently, the input stream cannot be re-used.

  is - Input stream to read from - `java.io.InputStream`
  load-updater - Whether to load the updater from the model or not - `boolean`

  returns: Model and normalizer, if present - `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.nn.multilayer.MultiLayerNetwork,org.nd4j.linalg.dataset.api.preprocessor.Normalizer>`

  throws: java.io.IOException - If an error occurs when reading from the stream"
  (^org.nd4j.linalg.primitives.Pair [^java.io.InputStream is ^Boolean load-updater]
    (ModelSerializer/restoreMultiLayerNetworkAndNormalizer is load-updater)))

(defn *list-objects-in-file
  "List the keys of all objects added using the method addObjectToFile(File, String, Object)

  f - File previously created with ModelSerializer - `java.io.File`

  returns: List of keys that can be used with getObjectFromFile(File, String) - `java.util.List<java.lang.String>`"
  (^java.util.List [^java.io.File f]
    (ModelSerializer/listObjectsInFile f)))

(defn *task-by-model
  "model - `org.deeplearning4j.nn.api.Model`

  returns: `org.nd4j.linalg.heartbeat.reports.Task`"
  (^org.nd4j.linalg.heartbeat.reports.Task [^org.deeplearning4j.nn.api.Model model]
    (ModelSerializer/taskByModel model)))

(defn *add-normalizer-to-model
  "This method appends normalizer to a given persisted model.
  PLEASE NOTE: File should be model file saved earlier with ModelSerializer

  f - `java.io.File`
  normalizer - `org.nd4j.linalg.dataset.api.preprocessor.Normalizer`"
  ([^java.io.File f ^org.nd4j.linalg.dataset.api.preprocessor.Normalizer normalizer]
    (ModelSerializer/addNormalizerToModel f normalizer)))

(defn *restore-normalizer-from-input-stream
  "This method restores the normalizer form a persisted model file.

  is - A stream to load data from. - `java.io.InputStream`

  returns: the loaded normalizer - `<T extends org.nd4j.linalg.dataset.api.preprocessor.Normalizer> T`

  throws: java.io.IOException"
  ([^java.io.InputStream is]
    (ModelSerializer/restoreNormalizerFromInputStream is)))

(defn *add-object-to-file
  "Add an object to the (already existing) model file using Java Object Serialization. Objects can be restored
  using getObjectFromFile(File, String)

  f - File to add the object to - `java.io.File`
  key - Key to store the object under - `java.lang.String`
  o - Object to store using Java object serialization - `java.lang.Object`"
  ([^java.io.File f ^java.lang.String key ^java.lang.Object o]
    (ModelSerializer/addObjectToFile f key o)))

(defn *restore-normalizer-from-file
  "This method restores normalizer from a given persisted model file
  PLEASE NOTE: File should be model file saved earlier with ModelSerializer with addNormalizerToModel being called

  file - `java.io.File`

  returns: `<T extends org.nd4j.linalg.dataset.api.preprocessor.Normalizer> T`"
  ([^java.io.File file]
    (ModelSerializer/restoreNormalizerFromFile file)))

(defn *write-model
  "Write a model to a file

  model - the model to write - `org.deeplearning4j.nn.api.Model`
  file - the file to write to - `java.io.File`
  save-updater - whether to save the updater or not - `boolean`
  data-normalization - the normalizer to save (optional) - `org.nd4j.linalg.dataset.api.preprocessor.DataNormalization`

  throws: java.io.IOException"
  ([^org.deeplearning4j.nn.api.Model model ^java.io.File file ^Boolean save-updater ^org.nd4j.linalg.dataset.api.preprocessor.DataNormalization data-normalization]
    (ModelSerializer/writeModel model file save-updater data-normalization))
  ([^org.deeplearning4j.nn.api.Model model ^java.io.File file ^Boolean save-updater]
    (ModelSerializer/writeModel model file save-updater)))

(defn *restore-computation-graph
  "Load a computation graph from a file

  path - path to the model file, to get the computation graph from - `java.lang.String`
  load-updater - `boolean`

  returns: the loaded computation graph - `org.deeplearning4j.nn.graph.ComputationGraph`

  throws: java.io.IOException"
  (^org.deeplearning4j.nn.graph.ComputationGraph [^java.lang.String path ^Boolean load-updater]
    (ModelSerializer/restoreComputationGraph path load-updater))
  (^org.deeplearning4j.nn.graph.ComputationGraph [^java.lang.String path]
    (ModelSerializer/restoreComputationGraph path)))

(defn *restore-computation-graph-and-normalizer
  "Restore a ComputationGraph and Normalizer (if present - null if not) from the InputStream.
  Note: the input stream is read fully and closed by this method. Consequently, the input stream cannot be re-used.

  is - Input stream to read from - `java.io.InputStream`
  load-updater - Whether to load the updater from the model or not - `boolean`

  returns: Model and normalizer, if present - `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.nn.graph.ComputationGraph,org.nd4j.linalg.dataset.api.preprocessor.Normalizer>`

  throws: java.io.IOException - If an error occurs when reading from the stream"
  (^org.nd4j.linalg.primitives.Pair [^java.io.InputStream is ^Boolean load-updater]
    (ModelSerializer/restoreComputationGraphAndNormalizer is load-updater)))

