(ns org.datavec.nlp.annotator.SentenceAnnotator
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.nlp.annotator SentenceAnnotator]))

(defn ->sentence-annotator
  "Constructor."
  (^SentenceAnnotator []
    (new SentenceAnnotator )))

(defn *get-description
  "returns: `org.apache.uima.analysis_engine.AnalysisEngineDescription`

  throws: org.apache.uima.resource.ResourceInitializationException"
  (^org.apache.uima.analysis_engine.AnalysisEngineDescription []
    (SentenceAnnotator/getDescription )))

(defn process
  "j-cas - `org.apache.uima.jcas.JCas`

  throws: org.apache.uima.analysis_engine.AnalysisEngineProcessException"
  ([^SentenceAnnotator this ^org.apache.uima.jcas.JCas j-cas]
    (-> this (.process j-cas))))

