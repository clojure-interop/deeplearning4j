(ns org.deeplearning4j.text.annotator.PoStagger
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.text.annotator PoStagger]))

(defn ->po-stagger
  "Constructor.

  Initializes a new instance.
  Note: Use initialize(UimaContext) to initialize this instance. Not use the
  constructor."
  (^PoStagger []
    (new PoStagger )))

(defn *get-description
  "language-code - `java.lang.String`

  returns: `org.apache.uima.analysis_engine.AnalysisEngineDescription`

  throws: org.apache.uima.resource.ResourceInitializationException"
  (^org.apache.uima.analysis_engine.AnalysisEngineDescription [^java.lang.String language-code]
    (PoStagger/getDescription language-code)))

(defn initialize
  "Initializes the current instance with the given context.
  Note: Do all initialization in this method, do not use the constructor.

  context - `org.apache.uima.UimaContext`

  throws: org.apache.uima.resource.ResourceInitializationException"
  ([^PoStagger this ^org.apache.uima.UimaContext context]
    (-> this (.initialize context))))

(defn type-system-init
  "Initializes the type system.

  type-system - `org.apache.uima.cas.TypeSystem`

  throws: org.apache.uima.analysis_engine.AnalysisEngineProcessException"
  ([^PoStagger this ^org.apache.uima.cas.TypeSystem type-system]
    (-> this (.typeSystemInit type-system))))

(defn process
  "Performs pos-tagging on the given tcas object.

  tcas - `org.apache.uima.cas.CAS`"
  ([^PoStagger this ^org.apache.uima.cas.CAS tcas]
    (-> this (.process tcas))))

(defn destroy
  "Releases allocated resources."
  ([^PoStagger this]
    (-> this (.destroy))))

