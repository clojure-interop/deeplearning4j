(ns org.datavec.nlp.tokenization.tokenizerfactory.PosUimaTokenizerFactory
  "Creates a tokenizer that filters by
 part of speech tags"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.nlp.tokenization.tokenizerfactory PosUimaTokenizerFactory]))

(defn ->pos-uima-tokenizer-factory
  "Constructor.

  tokenizer - `org.apache.uima.analysis_engine.AnalysisEngine`
  allowed-pos-tags - `java.util.Collection`"
  (^PosUimaTokenizerFactory [^org.apache.uima.analysis_engine.AnalysisEngine tokenizer ^java.util.Collection allowed-pos-tags]
    (new PosUimaTokenizerFactory tokenizer allowed-pos-tags))
  (^PosUimaTokenizerFactory [^java.util.Collection allowed-po-s-tags]
    (new PosUimaTokenizerFactory allowed-po-s-tags)))

(defn *default-analysis-engine
  "returns: `org.apache.uima.analysis_engine.AnalysisEngine`"
  (^org.apache.uima.analysis_engine.AnalysisEngine []
    (PosUimaTokenizerFactory/defaultAnalysisEngine )))

(defn create
  "Description copied from interface: TokenizerFactory

  to-tokenize - the string to createComplex the tokenizer with - `java.lang.String`

  returns: the new tokenizer - `org.datavec.nlp.tokenization.tokenizer.Tokenizer`"
  (^org.datavec.nlp.tokenization.tokenizer.Tokenizer [^PosUimaTokenizerFactory this ^java.lang.String to-tokenize]
    (-> this (.create to-tokenize))))

(defn set-token-pre-processor
  "Description copied from interface: TokenizerFactory

  pre-processor - the token pre processor to use - `org.datavec.nlp.tokenization.tokenizer.TokenPreProcess`"
  ([^PosUimaTokenizerFactory this ^org.datavec.nlp.tokenization.tokenizer.TokenPreProcess pre-processor]
    (-> this (.setTokenPreProcessor pre-processor))))

