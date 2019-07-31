(ns org.datavec.api.transform.analysis.quality.string.StringQualityAnalysisState
  "Created by huitseeker on 3/6/17."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.analysis.quality.string StringQualityAnalysisState]))

(defn ->string-quality-analysis-state
  "Constructor.

  string-meta-data - `org.datavec.api.transform.metadata.StringMetaData`"
  (^StringQualityAnalysisState [^org.datavec.api.transform.metadata.StringMetaData string-meta-data]
    (new StringQualityAnalysisState string-meta-data)))

(defn add
  "writable - `org.datavec.api.writable.Writable`

  returns: `org.datavec.api.transform.analysis.quality.string.StringQualityAnalysisState`"
  (^org.datavec.api.transform.analysis.quality.string.StringQualityAnalysisState [^StringQualityAnalysisState this ^org.datavec.api.writable.Writable writable]
    (-> this (.add writable))))

(defn merge
  "other - `org.datavec.api.transform.analysis.quality.string.StringQualityAnalysisState`

  returns: `org.datavec.api.transform.analysis.quality.string.StringQualityAnalysisState`"
  (^org.datavec.api.transform.analysis.quality.string.StringQualityAnalysisState [^StringQualityAnalysisState this ^org.datavec.api.transform.analysis.quality.string.StringQualityAnalysisState other]
    (-> this (.merge other))))

(defn get-column-quality
  "returns: `org.datavec.api.transform.quality.columns.ColumnQuality`"
  (^org.datavec.api.transform.quality.columns.ColumnQuality [^StringQualityAnalysisState this]
    (-> this (.getColumnQuality))))

