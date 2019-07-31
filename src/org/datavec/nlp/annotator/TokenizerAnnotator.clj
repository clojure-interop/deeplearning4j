(ns org.datavec.nlp.annotator.TokenizerAnnotator
  "Overrides OpenNLP tokenizer to be thread safe"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.nlp.annotator TokenizerAnnotator]))

(defn ->tokenizer-annotator
  "Constructor."
  (^TokenizerAnnotator []
    (new TokenizerAnnotator )))

(defn *get-description
  "language-code - `java.lang.String`

  returns: `org.apache.uima.analysis_engine.AnalysisEngineDescription`

  throws: org.apache.uima.resource.ResourceInitializationException"
  (^org.apache.uima.analysis_engine.AnalysisEngineDescription [^java.lang.String language-code]
    (TokenizerAnnotator/getDescription language-code))
  (^org.apache.uima.analysis_engine.AnalysisEngineDescription []
    (TokenizerAnnotator/getDescription )))

