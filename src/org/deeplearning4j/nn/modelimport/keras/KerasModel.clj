(ns org.deeplearning4j.nn.modelimport.keras.KerasModel
  "Build ComputationGraph from Keras (Functional API) Model or
 Sequential model configuration."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.modelimport.keras KerasModel]))

(defn ->keras-model
  "Constructor.

  (Recommended) Builder-pattern constructor for (Functional API) Model.

  model-builder - builder object - `org.deeplearning4j.nn.modelimport.keras.utils.KerasModelBuilder`

  throws: java.io.IOException - IO exception"
  (^KerasModel [^org.deeplearning4j.nn.modelimport.keras.utils.KerasModelBuilder model-builder]
    (new KerasModel model-builder))
  (^KerasModel []
    (new KerasModel )))

(defn model-builder
  "returns: `org.deeplearning4j.nn.modelimport.keras.utils.KerasModelBuilder`"
  (^org.deeplearning4j.nn.modelimport.keras.utils.KerasModelBuilder [^KerasModel this]
    (-> this (.modelBuilder))))

(defn get-computation-graph-configuration
  "Configure a ComputationGraph from this Keras Model configuration.

  returns: ComputationGraph - `org.deeplearning4j.nn.conf.ComputationGraphConfiguration`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException"
  (^org.deeplearning4j.nn.conf.ComputationGraphConfiguration [^KerasModel this]
    (-> this (.getComputationGraphConfiguration))))

(defn get-computation-graph
  "Build a ComputationGraph from this Keras Model configuration and (optionally) import weights.

  import-weights - whether to import weights - `boolean`

  returns: ComputationGraph - `org.deeplearning4j.nn.graph.ComputationGraph`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException"
  (^org.deeplearning4j.nn.graph.ComputationGraph [^KerasModel this ^Boolean import-weights]
    (-> this (.getComputationGraph import-weights)))
  (^org.deeplearning4j.nn.graph.ComputationGraph [^KerasModel this]
    (-> this (.getComputationGraph))))

