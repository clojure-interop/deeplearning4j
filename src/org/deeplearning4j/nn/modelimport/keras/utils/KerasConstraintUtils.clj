(ns org.deeplearning4j.nn.modelimport.keras.utils.KerasConstraintUtils
  "Utility functionality for keras constraints."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.modelimport.keras.utils KerasConstraintUtils]))

(defn ->keras-constraint-utils
  "Constructor."
  (^KerasConstraintUtils []
    (new KerasConstraintUtils )))

(defn *map-constraint
  "Map Keras to DL4J constraint.

  keras-constraint - String containing Keras constraint name - `java.lang.String`
  conf - Keras layer configuration - `org.deeplearning4j.nn.modelimport.keras.config.KerasLayerConfiguration`
  constraint-config - `java.util.Map`

  returns: DL4J LayerConstraint - `org.deeplearning4j.nn.api.layers.LayerConstraint`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.UnsupportedKerasConfigurationException"
  (^org.deeplearning4j.nn.api.layers.LayerConstraint [^java.lang.String keras-constraint ^org.deeplearning4j.nn.modelimport.keras.config.KerasLayerConfiguration conf ^java.util.Map constraint-config]
    (KerasConstraintUtils/mapConstraint keras-constraint conf constraint-config)))

(defn *get-constraints-from-config
  "Get constraint initialization from Keras layer configuration.

  layer-config - dictionary containing Keras layer configuration - `java.util.Map`
  constraint-field - string in configuration representing parameter to constrain - `java.lang.String`
  conf - Keras layer configuration - `org.deeplearning4j.nn.modelimport.keras.config.KerasLayerConfiguration`
  keras-major-version - Major keras version as integer (1 or 2) - `int`

  returns: a valid LayerConstraint - `org.deeplearning4j.nn.api.layers.LayerConstraint`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid configuration"
  (^org.deeplearning4j.nn.api.layers.LayerConstraint [^java.util.Map layer-config ^java.lang.String constraint-field ^org.deeplearning4j.nn.modelimport.keras.config.KerasLayerConfiguration conf ^Integer keras-major-version]
    (KerasConstraintUtils/getConstraintsFromConfig layer-config constraint-field conf keras-major-version)))

