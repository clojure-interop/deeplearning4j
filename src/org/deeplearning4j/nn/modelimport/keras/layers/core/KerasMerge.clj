(ns org.deeplearning4j.nn.modelimport.keras.layers.core.KerasMerge
  "Imports a Keras Merge layer as a DL4J Merge (graph) vertex.

 TODO: handle axes arguments that alter merge behavior (requires changes to DL4J?)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.modelimport.keras.layers.core KerasMerge]))

(defn ->keras-merge
  "Constructor.

  Constructor from parsed Keras layer configuration dictionary and merge mode passed in.

  layer-config - dictionary containing Keras layer configuration - `java.util.Map`
  merge-mode - ElementWiseVertex merge mode - `org.deeplearning4j.nn.conf.graph.ElementWiseVertex$Op`
  enforce-training-config - whether to enforce training-related configuration options - `boolean`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^KerasMerge [^java.util.Map layer-config ^org.deeplearning4j.nn.conf.graph.ElementWiseVertex$Op merge-mode ^Boolean enforce-training-config]
    (new KerasMerge layer-config merge-mode enforce-training-config))
  (^KerasMerge [^java.util.Map layer-config ^Boolean enforce-training-config]
    (new KerasMerge layer-config enforce-training-config))
  (^KerasMerge [^java.lang.Integer keras-version]
    (new KerasMerge keras-version)))

(defn get-output-type
  "Get layer output type.

  input-type - Array of InputTypes - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: output type as InputType - `org.deeplearning4j.nn.conf.inputs.InputType`"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^KerasMerge this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getOutputType input-type))))

