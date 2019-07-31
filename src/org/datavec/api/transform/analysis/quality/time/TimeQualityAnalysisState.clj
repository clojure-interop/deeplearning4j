(ns org.datavec.api.transform.analysis.quality.time.TimeQualityAnalysisState
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.analysis.quality.time TimeQualityAnalysisState]))

(defn ->time-quality-analysis-state
  "Constructor.

  time-meta-data - `org.datavec.api.transform.metadata.TimeMetaData`"
  (^TimeQualityAnalysisState [^org.datavec.api.transform.metadata.TimeMetaData time-meta-data]
    (new TimeQualityAnalysisState time-meta-data)))

(defn add
  "writable - `org.datavec.api.writable.Writable`

  returns: `org.datavec.api.transform.analysis.quality.time.TimeQualityAnalysisState`"
  (^org.datavec.api.transform.analysis.quality.time.TimeQualityAnalysisState [^TimeQualityAnalysisState this ^org.datavec.api.writable.Writable writable]
    (-> this (.add writable))))

(defn merge
  "other - `org.datavec.api.transform.analysis.quality.time.TimeQualityAnalysisState`

  returns: `org.datavec.api.transform.analysis.quality.time.TimeQualityAnalysisState`"
  (^org.datavec.api.transform.analysis.quality.time.TimeQualityAnalysisState [^TimeQualityAnalysisState this ^org.datavec.api.transform.analysis.quality.time.TimeQualityAnalysisState other]
    (-> this (.merge other))))

(defn get-column-quality
  "returns: `org.datavec.api.transform.quality.columns.ColumnQuality`"
  (^org.datavec.api.transform.quality.columns.ColumnQuality [^TimeQualityAnalysisState this]
    (-> this (.getColumnQuality))))

