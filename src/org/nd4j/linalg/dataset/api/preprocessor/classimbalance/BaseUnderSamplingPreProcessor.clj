(ns org.nd4j.linalg.dataset.api.preprocessor.classimbalance.BaseUnderSamplingPreProcessor
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.dataset.api.preprocessor.classimbalance BaseUnderSamplingPreProcessor]))

(defn ->base-under-sampling-pre-processor
  "Constructor."
  (^BaseUnderSamplingPreProcessor []
    (new BaseUnderSamplingPreProcessor )))

(defn donot-mask-all-majority-windows
  "If a tbptt segment is all majority class labels default behaviour is to mask all time steps in the segment.
  donotMaskAllMajorityWindows() will override the default and mask (1-targetDist)% of the time steps"
  ([^BaseUnderSamplingPreProcessor this]
    (-> this (.donotMaskAllMajorityWindows))))

(defn donot-mask-minority-windows
  "If set will not mask timesteps if they fall in a tbptt segment with at least one minority class label"
  ([^BaseUnderSamplingPreProcessor this]
    (-> this (.donotMaskMinorityWindows))))

(defn adjust-masks
  "label - `org.nd4j.linalg.api.ndarray.INDArray`
  label-mask - `org.nd4j.linalg.api.ndarray.INDArray`
  minority-label - `int`
  target-dist - `double`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseUnderSamplingPreProcessor this ^org.nd4j.linalg.api.ndarray.INDArray label ^org.nd4j.linalg.api.ndarray.INDArray label-mask ^Integer minority-label ^Double target-dist]
    (-> this (.adjustMasks label label-mask minority-label target-dist))))

