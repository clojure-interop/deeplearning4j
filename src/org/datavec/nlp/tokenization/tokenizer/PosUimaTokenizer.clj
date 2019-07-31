(ns org.datavec.nlp.tokenization.tokenizer.PosUimaTokenizer
  "Filter by part of speech tag.
 Any not valid part of speech tags
 become NONE"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.nlp.tokenization.tokenizer PosUimaTokenizer]))

(defn ->pos-uima-tokenizer
  "Constructor.

  tokens - `java.lang.String`
  engine - `org.apache.uima.analysis_engine.AnalysisEngine`
  allowed-pos-tags - `java.util.Collection`"
  (^PosUimaTokenizer [^java.lang.String tokens ^org.apache.uima.analysis_engine.AnalysisEngine engine ^java.util.Collection allowed-pos-tags]
    (new PosUimaTokenizer tokens engine allowed-pos-tags)))

(defn *default-analysis-engine
  "returns: `org.apache.uima.analysis_engine.AnalysisEngine`"
  (^org.apache.uima.analysis_engine.AnalysisEngine []
    (PosUimaTokenizer/defaultAnalysisEngine )))

(defn has-more-tokens?
  "Description copied from interface: Tokenizer

  returns: whether there is anymore tokens
  to iterate over - `boolean`"
  (^Boolean [^PosUimaTokenizer this]
    (-> this (.hasMoreTokens))))

(defn count-tokens
  "Description copied from interface: Tokenizer

  returns: the number of tokens - `int`"
  (^Integer [^PosUimaTokenizer this]
    (-> this (.countTokens))))

(defn next-token
  "Description copied from interface: Tokenizer

  returns: the next token in the string if any - `java.lang.String`"
  (^java.lang.String [^PosUimaTokenizer this]
    (-> this (.nextToken))))

(defn get-tokens
  "Description copied from interface: Tokenizer

  returns: a list of all the tokens - `java.util.List<java.lang.String>`"
  (^java.util.List [^PosUimaTokenizer this]
    (-> this (.getTokens))))

(defn set-token-pre-processor
  "Description copied from interface: Tokenizer

  token-pre-processor - the token pre processor to set - `org.datavec.nlp.tokenization.tokenizer.TokenPreProcess`"
  ([^PosUimaTokenizer this ^org.datavec.nlp.tokenization.tokenizer.TokenPreProcess token-pre-processor]
    (-> this (.setTokenPreProcessor token-pre-processor))))

