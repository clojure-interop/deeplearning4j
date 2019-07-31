(ns org.deeplearning4j.nn.conf.layers.InputTypeUtil
  "Utilities for calculating input types"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers InputTypeUtil]))

(defn ->input-type-util
  "Constructor."
  (^InputTypeUtil []
    (new InputTypeUtil )))

(defn *get-output-type-deconv-layer
  "input-type - `org.deeplearning4j.nn.conf.inputs.InputType`
  kernel-size - `int[]`
  stride - `int[]`
  padding - `int[]`
  dilation - `int[]`
  convolution-mode - `org.deeplearning4j.nn.conf.ConvolutionMode`
  output-depth - `long`
  layer-idx - `long`
  layer-name - `java.lang.String`
  layer-class - `java.lang.Class`

  returns: `org.deeplearning4j.nn.conf.inputs.InputType`"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^org.deeplearning4j.nn.conf.inputs.InputType input-type kernel-size stride padding dilation ^org.deeplearning4j.nn.conf.ConvolutionMode convolution-mode ^Long output-depth ^Long layer-idx ^java.lang.String layer-name ^java.lang.Class layer-class]
    (InputTypeUtil/getOutputTypeDeconvLayer input-type kernel-size stride padding dilation convolution-mode output-depth layer-idx layer-name layer-class)))

(defn *get-output-type-cnn-3-d-layers
  "input-type - `org.deeplearning4j.nn.conf.inputs.InputType`
  kernel-size - `int[]`
  stride - `int[]`
  padding - `int[]`
  dilation - `int[]`
  convolution-mode - `org.deeplearning4j.nn.conf.ConvolutionMode`
  output-channels - `long`
  layer-idx - `long`
  layer-name - `java.lang.String`
  layer-class - `java.lang.Class`

  returns: `org.deeplearning4j.nn.conf.inputs.InputType`"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^org.deeplearning4j.nn.conf.inputs.InputType input-type kernel-size stride padding dilation ^org.deeplearning4j.nn.conf.ConvolutionMode convolution-mode ^Long output-channels ^Long layer-idx ^java.lang.String layer-name ^java.lang.Class layer-class]
    (InputTypeUtil/getOutputTypeCnn3DLayers input-type kernel-size stride padding dilation convolution-mode output-channels layer-idx layer-name layer-class)))

(defn *get-output-type-cnn-1-d-layers
  "input-type - `org.deeplearning4j.nn.conf.inputs.InputType`
  k-h - `int`
  s-h - `int`
  pad-h - `int`
  dilation - `int`
  convolution-mode - `org.deeplearning4j.nn.conf.ConvolutionMode`
  output-depth - `long`
  layer-idx - `long`
  layer-name - `java.lang.String`
  layer-class - `java.lang.Class`

  returns: `org.deeplearning4j.nn.conf.inputs.InputType`"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^org.deeplearning4j.nn.conf.inputs.InputType input-type ^Integer k-h ^Integer s-h ^Integer pad-h ^Integer dilation ^org.deeplearning4j.nn.conf.ConvolutionMode convolution-mode ^Long output-depth ^Long layer-idx ^java.lang.String layer-name ^java.lang.Class layer-class]
    (InputTypeUtil/getOutputTypeCnn1DLayers input-type k-h s-h pad-h dilation convolution-mode output-depth layer-idx layer-name layer-class)))

(defn *get-output-type-cnn-layers
  "input-type - `org.deeplearning4j.nn.conf.inputs.InputType`
  kernel-size - `int[]`
  stride - `int[]`
  padding - `int[]`
  dilation - `int[]`
  convolution-mode - `org.deeplearning4j.nn.conf.ConvolutionMode`
  output-depth - `long`
  layer-idx - `long`
  layer-name - `java.lang.String`
  layer-class - `java.lang.Class`

  returns: `org.deeplearning4j.nn.conf.inputs.InputType`"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^org.deeplearning4j.nn.conf.inputs.InputType input-type kernel-size stride padding dilation ^org.deeplearning4j.nn.conf.ConvolutionMode convolution-mode ^Long output-depth ^Long layer-idx ^java.lang.String layer-name ^java.lang.Class layer-class]
    (InputTypeUtil/getOutputTypeCnnLayers input-type kernel-size stride padding dilation convolution-mode output-depth layer-idx layer-name layer-class)))

(defn *get-pre-processor-for-input-type-cnn-3-d-layers
  "Utility method for determining the appropriate preprocessor for CNN layers, such as ConvolutionLayer and
  SubsamplingLayer

  input-type - Input type to get the preprocessor for - `org.deeplearning4j.nn.conf.inputs.InputType`
  layer-name - `java.lang.String`

  returns: Null if no preprocessor is required; otherwise the appropriate preprocessor for the given input type - `org.deeplearning4j.nn.conf.InputPreProcessor`"
  (^org.deeplearning4j.nn.conf.InputPreProcessor [^org.deeplearning4j.nn.conf.inputs.InputType input-type ^java.lang.String layer-name]
    (InputTypeUtil/getPreProcessorForInputTypeCnn3DLayers input-type layer-name)))

(defn *get-pre-processor-for-input-type-cnn-layers
  "Utility method for determining the appropriate preprocessor for CNN layers, such as ConvolutionLayer and
  SubsamplingLayer

  input-type - Input type to get the preprocessor for - `org.deeplearning4j.nn.conf.inputs.InputType`
  layer-name - `java.lang.String`

  returns: Null if no preprocessor is required; otherwise the appropriate preprocessor for the given input type - `org.deeplearning4j.nn.conf.InputPreProcessor`"
  (^org.deeplearning4j.nn.conf.InputPreProcessor [^org.deeplearning4j.nn.conf.inputs.InputType input-type ^java.lang.String layer-name]
    (InputTypeUtil/getPreProcessorForInputTypeCnnLayers input-type layer-name)))

(defn *get-preprocessor-for-input-type-rnn-layers
  "input-type - `org.deeplearning4j.nn.conf.inputs.InputType`
  layer-name - `java.lang.String`

  returns: `org.deeplearning4j.nn.conf.InputPreProcessor`"
  (^org.deeplearning4j.nn.conf.InputPreProcessor [^org.deeplearning4j.nn.conf.inputs.InputType input-type ^java.lang.String layer-name]
    (InputTypeUtil/getPreprocessorForInputTypeRnnLayers input-type layer-name)))

