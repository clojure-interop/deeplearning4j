(ns org.datavec.api.transform.analysis.quality.real.RealQualityAnalysisState
  "Created by huitseeker on 3/6/17."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.analysis.quality.real RealQualityAnalysisState]))

(defn ->real-quality-analysis-state
  "Constructor.

  real-meta-data - `org.datavec.api.transform.metadata.DoubleMetaData`"
  (^RealQualityAnalysisState [^org.datavec.api.transform.metadata.DoubleMetaData real-meta-data]
    (new RealQualityAnalysisState real-meta-data)))

(defn add
  "writable - `org.datavec.api.writable.Writable`

  returns: `org.datavec.api.transform.analysis.quality.real.RealQualityAnalysisState`"
  (^org.datavec.api.transform.analysis.quality.real.RealQualityAnalysisState [^RealQualityAnalysisState this ^org.datavec.api.writable.Writable writable]
    (-> this (.add writable))))

(defn merge
  "other - `org.datavec.api.transform.analysis.quality.real.RealQualityAnalysisState`

  returns: `org.datavec.api.transform.analysis.quality.real.RealQualityAnalysisState`"
  (^org.datavec.api.transform.analysis.quality.real.RealQualityAnalysisState [^RealQualityAnalysisState this ^org.datavec.api.transform.analysis.quality.real.RealQualityAnalysisState other]
    (-> this (.merge other))))

(defn get-column-quality
  "returns: `org.datavec.api.transform.quality.columns.ColumnQuality`"
  (^org.datavec.api.transform.quality.columns.ColumnQuality [^RealQualityAnalysisState this]
    (-> this (.getColumnQuality))))

