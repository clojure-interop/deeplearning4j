(ns org.deeplearning4j.text.uima.UimaResource
  "Resource holder for uima"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.text.uima UimaResource]))

(defn ->uima-resource
  "Constructor.

  analysis-engine - `org.apache.uima.analysis_engine.AnalysisEngine`
  cas-pool - `org.apache.uima.util.CasPool`"
  (^UimaResource [^org.apache.uima.analysis_engine.AnalysisEngine analysis-engine ^org.apache.uima.util.CasPool cas-pool]
    (new UimaResource analysis-engine cas-pool))
  (^UimaResource [^org.apache.uima.analysis_engine.AnalysisEngine analysis-engine]
    (new UimaResource analysis-engine)))

(defn get-analysis-engine
  "returns: `org.apache.uima.analysis_engine.AnalysisEngine`"
  (^org.apache.uima.analysis_engine.AnalysisEngine [^UimaResource this]
    (-> this (.getAnalysisEngine))))

(defn set-analysis-engine
  "analysis-engine - `org.apache.uima.analysis_engine.AnalysisEngine`"
  ([^UimaResource this ^org.apache.uima.analysis_engine.AnalysisEngine analysis-engine]
    (-> this (.setAnalysisEngine analysis-engine))))

(defn get-cas-pool
  "returns: `org.apache.uima.util.CasPool`"
  (^org.apache.uima.util.CasPool [^UimaResource this]
    (-> this (.getCasPool))))

(defn set-cas-pool
  "cas-pool - `org.apache.uima.util.CasPool`"
  ([^UimaResource this ^org.apache.uima.util.CasPool cas-pool]
    (-> this (.setCasPool cas-pool))))

(defn process
  "Use the given analysis engine and process the given text
  You must release the return cas yourself

  text - the text to process - `java.lang.String`

  returns: the processed cas - `org.apache.uima.cas.CAS`"
  (^org.apache.uima.cas.CAS [^UimaResource this ^java.lang.String text]
    (-> this (.process text))))

(defn retrieve
  "returns: `org.apache.uima.cas.CAS`"
  (^org.apache.uima.cas.CAS [^UimaResource this]
    (-> this (.retrieve))))

(defn release
  "cas - `org.apache.uima.cas.CAS`"
  ([^UimaResource this ^org.apache.uima.cas.CAS cas]
    (-> this (.release cas))))

