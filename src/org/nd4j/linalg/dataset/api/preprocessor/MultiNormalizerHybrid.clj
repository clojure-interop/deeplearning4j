(ns org.nd4j.linalg.dataset.api.preprocessor.MultiNormalizerHybrid
  "Pre processor for MultiDataSet that can be configured to use different normalization strategies for different inputs
 and outputs, or none at all. Can be used for example when one input should be normalized, but a different one should
 be untouched because it's the input for an embedding layer. Alternatively, one might want to mix standardization and
 min-max scaling for different inputs and outputs.

 By default, no normalization is applied. There are methods to configure the desired normalization strategy for inputs
 and outputs either globally or on an individual input/output level. Specific input/output strategies will override
 global ones."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.dataset.api.preprocessor MultiNormalizerHybrid]))

(defn ->multi-normalizer-hybrid
  "Constructor."
  (^MultiNormalizerHybrid []
    (new MultiNormalizerHybrid )))

(defn revert
  "Undo (revert) the normalization applied by this DataNormalization instance (arrays are modified in-place)

  data - MultiDataSet to revert the normalization on - `org.nd4j.linalg.dataset.api.MultiDataSet`"
  ([^MultiNormalizerHybrid this ^org.nd4j.linalg.dataset.api.MultiDataSet data]
    (-> this (.revert data))))

(defn fit
  "Fit a MultiDataSet (only compute based on the statistics from this dataset)

  data-set - the dataset to compute on - `org.nd4j.linalg.dataset.api.MultiDataSet`"
  ([^MultiNormalizerHybrid this ^org.nd4j.linalg.dataset.api.MultiDataSet data-set]
    (-> this (.fit data-set))))

(defn get-type
  "Description copied from interface: Normalizer

  returns: the opType - `org.nd4j.linalg.dataset.api.preprocessor.serializer.NormalizerType`"
  (^org.nd4j.linalg.dataset.api.preprocessor.serializer.NormalizerType [^MultiNormalizerHybrid this]
    (-> this (.getType))))

(defn min-max-scale-output
  "Apply min-max scaling to a specific output, overriding the global output strategy if any

  output - the index of the input - `int`
  range-from - lower bound of the target range - `double`
  range-to - upper bound of the target range - `double`

  returns: the normalizer - `org.nd4j.linalg.dataset.api.preprocessor.MultiNormalizerHybrid`"
  (^org.nd4j.linalg.dataset.api.preprocessor.MultiNormalizerHybrid [^MultiNormalizerHybrid this ^Integer output ^Double range-from ^Double range-to]
    (-> this (.minMaxScaleOutput output range-from range-to)))
  (^org.nd4j.linalg.dataset.api.preprocessor.MultiNormalizerHybrid [^MultiNormalizerHybrid this ^Integer output]
    (-> this (.minMaxScaleOutput output))))

(defn transform
  "Transform the dataset

  data - the dataset to pre process - `org.nd4j.linalg.dataset.api.MultiDataSet`"
  ([^MultiNormalizerHybrid this ^org.nd4j.linalg.dataset.api.MultiDataSet data]
    (-> this (.transform data))))

(defn min-max-scale-input
  "Apply min-max scaling to a specific input, overriding the global input strategy if any

  input - the index of the input - `int`
  range-from - lower bound of the target range - `double`
  range-to - upper bound of the target range - `double`

  returns: the normalizer - `org.nd4j.linalg.dataset.api.preprocessor.MultiNormalizerHybrid`"
  (^org.nd4j.linalg.dataset.api.preprocessor.MultiNormalizerHybrid [^MultiNormalizerHybrid this ^Integer input ^Double range-from ^Double range-to]
    (-> this (.minMaxScaleInput input range-from range-to)))
  (^org.nd4j.linalg.dataset.api.preprocessor.MultiNormalizerHybrid [^MultiNormalizerHybrid this ^Integer input]
    (-> this (.minMaxScaleInput input))))

(defn pre-process
  "Description copied from interface: MultiDataSetPreProcessor

  data - `org.nd4j.linalg.dataset.api.MultiDataSet`"
  ([^MultiNormalizerHybrid this ^org.nd4j.linalg.dataset.api.MultiDataSet data]
    (-> this (.preProcess data))))

(defn standardize-all-inputs
  "Apply standardization to all inputs, except the ones individually configured

  returns: the normalizer - `org.nd4j.linalg.dataset.api.preprocessor.MultiNormalizerHybrid`"
  (^org.nd4j.linalg.dataset.api.preprocessor.MultiNormalizerHybrid [^MultiNormalizerHybrid this]
    (-> this (.standardizeAllInputs))))

(defn standardize-input
  "Apply standardization to a specific input, overriding the global input strategy if any

  input - the index of the input - `int`

  returns: the normalizer - `org.nd4j.linalg.dataset.api.preprocessor.MultiNormalizerHybrid`"
  (^org.nd4j.linalg.dataset.api.preprocessor.MultiNormalizerHybrid [^MultiNormalizerHybrid this ^Integer input]
    (-> this (.standardizeInput input))))

(defn get-input-stats
  "Get normalization statistics for a given input.

  input - the index of the input - `int`

  returns: implementation of NormalizerStats corresponding to the normalization strategy selected - `org.nd4j.linalg.dataset.api.preprocessor.stats.NormalizerStats`"
  (^org.nd4j.linalg.dataset.api.preprocessor.stats.NormalizerStats [^MultiNormalizerHybrid this ^Integer input]
    (-> this (.getInputStats input)))
  (^java.util.Map [^MultiNormalizerHybrid this]
    (-> this (.getInputStats))))

(defn min-max-scale-all-outputs
  "Apply min-max scaling to all outputs, except the ones individually configured

  range-from - lower bound of the target range - `double`
  range-to - upper bound of the target range - `double`

  returns: the normalizer - `org.nd4j.linalg.dataset.api.preprocessor.MultiNormalizerHybrid`"
  (^org.nd4j.linalg.dataset.api.preprocessor.MultiNormalizerHybrid [^MultiNormalizerHybrid this ^Double range-from ^Double range-to]
    (-> this (.minMaxScaleAllOutputs range-from range-to)))
  (^org.nd4j.linalg.dataset.api.preprocessor.MultiNormalizerHybrid [^MultiNormalizerHybrid this]
    (-> this (.minMaxScaleAllOutputs))))

(defn min-max-scale-all-inputs
  "Apply min-max scaling to all inputs, except the ones individually configured

  range-from - lower bound of the target range - `double`
  range-to - upper bound of the target range - `double`

  returns: the normalizer - `org.nd4j.linalg.dataset.api.preprocessor.MultiNormalizerHybrid`"
  (^org.nd4j.linalg.dataset.api.preprocessor.MultiNormalizerHybrid [^MultiNormalizerHybrid this ^Double range-from ^Double range-to]
    (-> this (.minMaxScaleAllInputs range-from range-to)))
  (^org.nd4j.linalg.dataset.api.preprocessor.MultiNormalizerHybrid [^MultiNormalizerHybrid this]
    (-> this (.minMaxScaleAllInputs))))

(defn revert-features
  "Undo (revert) the normalization applied by this DataNormalization instance to the features of a particular input

  features - The normalized array of inputs - `org.nd4j.linalg.api.ndarray.INDArray[]`
  mask-arrays - Optional mask arrays belonging to the inputs - `org.nd4j.linalg.api.ndarray.INDArray[]`
  input - the index of the input to revert normalization on - `int`"
  ([^MultiNormalizerHybrid this features mask-arrays ^Integer input]
    (-> this (.revertFeatures features mask-arrays input)))
  ([^MultiNormalizerHybrid this features mask-arrays]
    (-> this (.revertFeatures features mask-arrays)))
  ([^MultiNormalizerHybrid this features]
    (-> this (.revertFeatures features))))

(defn get-output-stats
  "Get normalization statistics for a given output.

  output - the index of the output - `int`

  returns: implementation of NormalizerStats corresponding to the normalization strategy selected - `org.nd4j.linalg.dataset.api.preprocessor.stats.NormalizerStats`"
  (^org.nd4j.linalg.dataset.api.preprocessor.stats.NormalizerStats [^MultiNormalizerHybrid this ^Integer output]
    (-> this (.getOutputStats output)))
  (^java.util.Map [^MultiNormalizerHybrid this]
    (-> this (.getOutputStats))))

(defn standardize-output
  "Apply standardization to a specific output, overriding the global output strategy if any

  output - the index of the input - `int`

  returns: the normalizer - `org.nd4j.linalg.dataset.api.preprocessor.MultiNormalizerHybrid`"
  (^org.nd4j.linalg.dataset.api.preprocessor.MultiNormalizerHybrid [^MultiNormalizerHybrid this ^Integer output]
    (-> this (.standardizeOutput output))))

(defn revert-labels
  "Undo (revert) the normalization applied by this DataNormalization instance to the labels of a particular output

  labels - The normalized array of outputs - `org.nd4j.linalg.api.ndarray.INDArray[]`
  mask-arrays - Optional mask arrays belonging to the outputs - `org.nd4j.linalg.api.ndarray.INDArray[]`
  output - the index of the output to revert normalization on - `int`"
  ([^MultiNormalizerHybrid this labels mask-arrays ^Integer output]
    (-> this (.revertLabels labels mask-arrays output)))
  ([^MultiNormalizerHybrid this labels mask-arrays]
    (-> this (.revertLabels labels mask-arrays)))
  ([^MultiNormalizerHybrid this labels]
    (-> this (.revertLabels labels))))

(defn standardize-all-outputs
  "Apply standardization to all outputs, except the ones individually configured

  returns: the normalizer - `org.nd4j.linalg.dataset.api.preprocessor.MultiNormalizerHybrid`"
  (^org.nd4j.linalg.dataset.api.preprocessor.MultiNormalizerHybrid [^MultiNormalizerHybrid this]
    (-> this (.standardizeAllOutputs))))

