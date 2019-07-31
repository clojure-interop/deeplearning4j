(ns org.datavec.nlp.tokenization.tokenizer.ConcurrentTokenizer
  "OpenNLP Tokenizer annotator.

 Mandatory parameters

 Type Name Description
 String opennlp.uima.ModelName The name of the model file
 String opennlp.uima.SentenceType The full name of the sentence type
 String opennlp.uima.TokenType The full name of the token type


 Optional parameters

 Type Name Description
 String opennlp.uima.ProbabilityFeature The name of the double
 probability feature (not applyTransformToDestination by default)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.nlp.tokenization.tokenizer ConcurrentTokenizer]))

(defn ->concurrent-tokenizer
  "Constructor.

  Initializes a new instance.
  Note: Use initialize(UimaContext) to initialize
  this instance. Not use the constructor."
  (^ConcurrentTokenizer []
    (new ConcurrentTokenizer )))

(defn process
  "cas - `org.apache.uima.cas.CAS`

  throws: org.apache.uima.analysis_engine.AnalysisEngineProcessException"
  ([^ConcurrentTokenizer this ^org.apache.uima.cas.CAS cas]
    (-> this (.process cas))))

(defn initialize
  "Initializes the current instance with the given context.
  Note: Do all initialization in this method, do not use the constructor.

  context - `org.apache.uima.UimaContext`

  throws: org.apache.uima.resource.ResourceInitializationException"
  ([^ConcurrentTokenizer this ^org.apache.uima.UimaContext context]
    (-> this (.initialize context))))

(defn type-system-init
  "Initializes the type system.

  type-system - `org.apache.uima.cas.TypeSystem`

  throws: org.apache.uima.analysis_engine.AnalysisEngineProcessException"
  ([^ConcurrentTokenizer this ^org.apache.uima.cas.TypeSystem type-system]
    (-> this (.typeSystemInit type-system))))

(defn destroy
  "Releases allocated resources."
  ([^ConcurrentTokenizer this]
    (-> this (.destroy))))

