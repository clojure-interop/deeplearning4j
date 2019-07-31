(ns org.datavec.nlp.annotator.StemmerAnnotator
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.nlp.annotator StemmerAnnotator]))

(defn ->stemmer-annotator
  "Constructor."
  (^StemmerAnnotator []
    (new StemmerAnnotator )))

(defn *get-description
  "language - `java.lang.String`

  returns: `org.apache.uima.analysis_engine.AnalysisEngineDescription`

  throws: org.apache.uima.resource.ResourceInitializationException"
  (^org.apache.uima.analysis_engine.AnalysisEngineDescription [^java.lang.String language]
    (StemmerAnnotator/getDescription language))
  (^org.apache.uima.analysis_engine.AnalysisEngineDescription []
    (StemmerAnnotator/getDescription )))

(defn process
  "j-cas - `org.apache.uima.jcas.JCas`

  throws: org.apache.uima.analysis_engine.AnalysisEngineProcessException"
  ([^StemmerAnnotator this ^org.apache.uima.jcas.JCas j-cas]
    (-> this (.process j-cas))))

(defn set-stem
  "token - `org.cleartk.token.type.Token`
  stem - `java.lang.String`"
  ([^StemmerAnnotator this ^org.cleartk.token.type.Token token ^java.lang.String stem]
    (-> this (.setStem token stem))))

