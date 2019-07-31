(ns org.datavec.nlp.tokenization.tokenizerfactory.UimaTokenizerFactory
  "Uses a uima AnalysisEngine to
 tokenize text."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.nlp.tokenization.tokenizerfactory UimaTokenizerFactory]))

(defn ->uima-tokenizer-factory
  "Constructor.

  resource - `org.datavec.nlp.uima.UimaResource`
  check-for-label - `boolean`"
  (^UimaTokenizerFactory [^org.datavec.nlp.uima.UimaResource resource ^Boolean check-for-label]
    (new UimaTokenizerFactory resource check-for-label))
  (^UimaTokenizerFactory [^org.datavec.nlp.uima.UimaResource resource]
    (new UimaTokenizerFactory resource))
  (^UimaTokenizerFactory []
    (new UimaTokenizerFactory )))

(defn *default-analysis-engine
  "Creates a tokenization,/stemming pipeline

  returns: a tokenization/stemming pipeline - `org.apache.uima.analysis_engine.AnalysisEngine`"
  (^org.apache.uima.analysis_engine.AnalysisEngine []
    (UimaTokenizerFactory/defaultAnalysisEngine )))

(defn create
  "Description copied from interface: TokenizerFactory

  to-tokenize - the string to createComplex the tokenizer with - `java.lang.String`

  returns: the new tokenizer - `org.datavec.nlp.tokenization.tokenizer.Tokenizer`"
  (^org.datavec.nlp.tokenization.tokenizer.Tokenizer [^UimaTokenizerFactory this ^java.lang.String to-tokenize]
    (-> this (.create to-tokenize))))

(defn get-uima-resource
  "returns: `org.datavec.nlp.uima.UimaResource`"
  (^org.datavec.nlp.uima.UimaResource [^UimaTokenizerFactory this]
    (-> this (.getUimaResource))))

(defn set-token-pre-processor
  "Description copied from interface: TokenizerFactory

  pre-processor - the token pre processor to use - `org.datavec.nlp.tokenization.tokenizer.TokenPreProcess`"
  ([^UimaTokenizerFactory this ^org.datavec.nlp.tokenization.tokenizer.TokenPreProcess pre-processor]
    (-> this (.setTokenPreProcessor pre-processor))))

