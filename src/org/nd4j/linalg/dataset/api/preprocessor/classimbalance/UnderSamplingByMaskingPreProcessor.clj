(ns org.nd4j.linalg.dataset.api.preprocessor.classimbalance.UnderSamplingByMaskingPreProcessor
  "For use in time series with unbalanced binary classes trained with truncated back prop through time
 Undersamples the majority class by randomly masking time steps belonging to it
 Given a target distribution for the minority class and the window size (usually the value used with tbptt)
 the preprocessor will approximate the given target distribution for every window of given size for every sample of the minibatch
 By default '0' is considered the majority class and '1' the minorityLabel class
 Default can be overriden with .overrideMinorityDefault()

 ONLY masks belonging to the majority class are modified
 If a tbptt segment contains only majority class labels all time steps in that segment are masked. Can be overriden with
 donotMaskMinorityWindows() in which case 1 - target distribution % of time steps are masked"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.dataset.api.preprocessor.classimbalance UnderSamplingByMaskingPreProcessor]))

(defn ->under-sampling-by-masking-pre-processor
  "Constructor.

  The target distribution to approximate. Valid values are between (0,0.5].
  Eg. For a targetDist = 0.25 and tbpttWindowSize = 100:
  Every 100 time steps (starting from the last time step) will randomly mask majority time steps to approximate a 25:75 ratio of minorityLabel to majority classes

  target-dist - `double`
  window-size - Usually set to the size of the tbptt - `int`"
  (^UnderSamplingByMaskingPreProcessor [^Double target-dist ^Integer window-size]
    (new UnderSamplingByMaskingPreProcessor target-dist window-size)))

(defn override-minority-default
  "Will change the default minority label from \"1\" to \"0\" and correspondingly the majority class from \"0\" to \"1\""
  ([^UnderSamplingByMaskingPreProcessor this]
    (-> this (.overrideMinorityDefault))))

(defn pre-process
  "Description copied from interface: DataSetPreProcessor

  to-pre-process - the data set to pre process - `org.nd4j.linalg.dataset.api.DataSet`"
  ([^UnderSamplingByMaskingPreProcessor this ^org.nd4j.linalg.dataset.api.DataSet to-pre-process]
    (-> this (.preProcess to-pre-process))))

