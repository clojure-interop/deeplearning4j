(ns org.deeplearning4j.nn.modelimport.keras.layers.pooling.KerasPoolingUtils
  "Utility functionality for Keras pooling layers."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.modelimport.keras.layers.pooling KerasPoolingUtils]))

(defn ->keras-pooling-utils
  "Constructor."
  (^KerasPoolingUtils []
    (new KerasPoolingUtils )))

(defn *map-pooling-type
  "Map Keras pooling layers to DL4J pooling types.

  class-name - name of the Keras pooling class - `java.lang.String`
  conf - `org.deeplearning4j.nn.modelimport.keras.config.KerasLayerConfiguration`

  returns: DL4J pooling type - `org.deeplearning4j.nn.conf.layers.PoolingType`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.UnsupportedKerasConfigurationException - Unsupported Keras config"
  (^org.deeplearning4j.nn.conf.layers.PoolingType [^java.lang.String class-name ^org.deeplearning4j.nn.modelimport.keras.config.KerasLayerConfiguration conf]
    (KerasPoolingUtils/mapPoolingType class-name conf)))

(defn *map-global-pooling-dimensions
  "Map Keras pooling layers to DL4J pooling dimensions.

  class-name - name of the Keras pooling class - `java.lang.String`
  conf - `org.deeplearning4j.nn.modelimport.keras.config.KerasLayerConfiguration`

  returns: pooling dimensions as int array - `int[]`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.UnsupportedKerasConfigurationException - Unsupported Keras config"
  ([^java.lang.String class-name ^org.deeplearning4j.nn.modelimport.keras.config.KerasLayerConfiguration conf]
    (KerasPoolingUtils/mapGlobalPoolingDimensions class-name conf)))

