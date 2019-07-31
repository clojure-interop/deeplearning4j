(ns org.datavec.api.transform.analysis.AnalysisCounter
  "Created by Alex on 23/06/2016."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.analysis AnalysisCounter]))

(defn add
  "writable - `org.datavec.api.writable.Writable`

  returns: `T`"
  ([^AnalysisCounter this ^org.datavec.api.writable.Writable writable]
    (-> this (.add writable))))

(defn merge
  "other - `T`

  returns: `T`"
  ([^AnalysisCounter this other]
    (-> this (.merge other))))

