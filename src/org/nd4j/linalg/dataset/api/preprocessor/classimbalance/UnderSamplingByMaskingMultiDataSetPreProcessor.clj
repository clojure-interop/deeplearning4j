(ns org.nd4j.linalg.dataset.api.preprocessor.classimbalance.UnderSamplingByMaskingMultiDataSetPreProcessor
  "The multidataset version of the UnderSamplingByMaskingPreProcessor
 Constructor takes a map - keys are indices of the multidataset to apply preprocessor to, values are the target distributions"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.dataset.api.preprocessor.classimbalance UnderSamplingByMaskingMultiDataSetPreProcessor]))

(defn ->under-sampling-by-masking-multi-data-set-pre-processor
  "Constructor.

  The target distribution to approximate. Valid values are between (0,0.5].

  target-dist - Key is index of label in multidataset to apply preprocessor. Value is the target dist for that index. - `java.util.Map`
  window-size - Usually set to the size of the tbptt - `int`"
  (^UnderSamplingByMaskingMultiDataSetPreProcessor [^java.util.Map target-dist ^Integer window-size]
    (new UnderSamplingByMaskingMultiDataSetPreProcessor target-dist window-size)))

(defn override-minority-default
  "Will change the default minority label from \"1\" to \"0\" and correspondingly the majority class from \"0\" to \"1\"
  for the label at the index specified

  index - `int`"
  ([^UnderSamplingByMaskingMultiDataSetPreProcessor this ^Integer index]
    (-> this (.overrideMinorityDefault index))))

(defn pre-process
  "Description copied from interface: MultiDataSetPreProcessor

  multi-data-set - `org.nd4j.linalg.dataset.api.MultiDataSet`"
  ([^UnderSamplingByMaskingMultiDataSetPreProcessor this ^org.nd4j.linalg.dataset.api.MultiDataSet multi-data-set]
    (-> this (.preProcess multi-data-set))))

