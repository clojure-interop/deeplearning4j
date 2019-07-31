(ns org.deeplearning4j.nn.modelimport.keras.layers.convolutional.KerasConvolutionUtils
  "Utility functionality for Keras convolution layers."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.modelimport.keras.layers.convolutional KerasConvolutionUtils]))

(defn ->keras-convolution-utils
  "Constructor."
  (^KerasConvolutionUtils []
    (new KerasConvolutionUtils )))

(defn *get-stride-from-config
  "Get (convolution) stride from Keras layer configuration.

  layer-config - dictionary containing Keras layer configuration - `java.util.Map`
  dimension - `int`
  conf - `org.deeplearning4j.nn.modelimport.keras.config.KerasLayerConfiguration`

  returns: Strides array from Keras configuration - `int[]`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  ([^java.util.Map layer-config ^Integer dimension ^org.deeplearning4j.nn.modelimport.keras.config.KerasLayerConfiguration conf]
    (KerasConvolutionUtils/getStrideFromConfig layer-config dimension conf)))

(defn *get-dilation-rate
  "Get atrous / dilation rate from config

  layer-config - dictionary containing Keras layer configuration - `java.util.Map`
  dimension - dimension of the convolution layer (1 or 2) - `int`
  conf - Keras layer configuration - `org.deeplearning4j.nn.modelimport.keras.config.KerasLayerConfiguration`
  force-dilation - boolean to indicate if dilation argument should be in config - `boolean`

  returns: list of integers with atrous rates - `int[]`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  ([^java.util.Map layer-config ^Integer dimension ^org.deeplearning4j.nn.modelimport.keras.config.KerasLayerConfiguration conf ^Boolean force-dilation]
    (KerasConvolutionUtils/getDilationRate layer-config dimension conf force-dilation)))

(defn *get-kernel-size-from-config
  "Get (convolution) kernel size from Keras layer configuration.

  layer-config - dictionary containing Keras layer configuration - `java.util.Map`
  dimension - `int`
  conf - `org.deeplearning4j.nn.modelimport.keras.config.KerasLayerConfiguration`
  keras-major-version - `int`

  returns: Convolutional kernel sizes - `int[]`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  ([^java.util.Map layer-config ^Integer dimension ^org.deeplearning4j.nn.modelimport.keras.config.KerasLayerConfiguration conf ^Integer keras-major-version]
    (KerasConvolutionUtils/getKernelSizeFromConfig layer-config dimension conf keras-major-version)))

(defn *get-convolution-mode-from-config
  "Get convolution border mode from Keras layer configuration.

  layer-config - dictionary containing Keras layer configuration - `java.util.Map`
  conf - `org.deeplearning4j.nn.modelimport.keras.config.KerasLayerConfiguration`

  returns: Border mode of convolutional layers - `org.deeplearning4j.nn.conf.ConvolutionMode`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras configuration"
  (^org.deeplearning4j.nn.conf.ConvolutionMode [^java.util.Map layer-config ^org.deeplearning4j.nn.modelimport.keras.config.KerasLayerConfiguration conf]
    (KerasConvolutionUtils/getConvolutionModeFromConfig layer-config conf)))

(defn *get-padding-from-border-mode-config
  "Get (convolution) padding from Keras layer configuration.

  layer-config - dictionary containing Keras layer configuration - `java.util.Map`
  dimension - `int`
  conf - `org.deeplearning4j.nn.modelimport.keras.config.KerasLayerConfiguration`
  keras-major-version - `int`

  returns: Padding values derived from border mode - `int[]`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  ([^java.util.Map layer-config ^Integer dimension ^org.deeplearning4j.nn.modelimport.keras.config.KerasLayerConfiguration conf ^Integer keras-major-version]
    (KerasConvolutionUtils/getPaddingFromBorderModeConfig layer-config dimension conf keras-major-version)))

