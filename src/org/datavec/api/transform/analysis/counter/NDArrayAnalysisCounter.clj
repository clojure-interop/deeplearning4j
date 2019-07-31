(ns org.datavec.api.transform.analysis.counter.NDArrayAnalysisCounter
  "A counter for performing analysis on NDArray columns"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.analysis.counter NDArrayAnalysisCounter]))

(defn ->nd-array-analysis-counter
  "Constructor."
  (^NDArrayAnalysisCounter []
    (new NDArrayAnalysisCounter )))

(defn add
  "writable - `org.datavec.api.writable.Writable`

  returns: `org.datavec.api.transform.analysis.counter.NDArrayAnalysisCounter`"
  (^org.datavec.api.transform.analysis.counter.NDArrayAnalysisCounter [^NDArrayAnalysisCounter this ^org.datavec.api.writable.Writable writable]
    (-> this (.add writable))))

(defn merge
  "other - `org.datavec.api.transform.analysis.counter.NDArrayAnalysisCounter`

  returns: `org.datavec.api.transform.analysis.counter.NDArrayAnalysisCounter`"
  (^org.datavec.api.transform.analysis.counter.NDArrayAnalysisCounter [^NDArrayAnalysisCounter this ^org.datavec.api.transform.analysis.counter.NDArrayAnalysisCounter other]
    (-> this (.merge other))))

(defn to-analysis-object
  "returns: `org.datavec.api.transform.analysis.columns.NDArrayAnalysis`"
  (^org.datavec.api.transform.analysis.columns.NDArrayAnalysis [^NDArrayAnalysisCounter this]
    (-> this (.toAnalysisObject))))

