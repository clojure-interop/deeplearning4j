(ns org.deeplearning4j.text.corpora.sentiwordnet.SWN3
  "Based on SentiWordnet"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.text.corpora.sentiwordnet SWN3]))

(defn ->swn-3
  "Constructor.

  analysis-engine - `org.apache.uima.analysis_engine.AnalysisEngine`"
  (^SWN3 [^org.apache.uima.analysis_engine.AnalysisEngine analysis-engine]
    (new SWN3 analysis-engine))
  (^SWN3 []
    (new SWN3 )))

(defn *main
  "args - `java.lang.String[]`"
  ([args]
    (SWN3/main args)))

(defn classify
  "Classifies the given text

  text - the text to classify - `java.lang.String`

  returns: the classification for the text - `java.lang.String`

  throws: java.lang.Exception"
  (^java.lang.String [^SWN3 this ^java.lang.String text]
    (-> this (.classify text))))

(defn score
  "Scores the text

  words - the text to score - `java.lang.String`

  returns: the score (polarity) for the text - `double`

  throws: java.lang.Exception"
  (^Double [^SWN3 this ^java.lang.String words]
    (-> this (.score words))))

(defn class-for-score
  "score - `java.lang.Double`

  returns: `java.lang.String`"
  (^java.lang.String [^SWN3 this ^java.lang.Double score]
    (-> this (.classForScore score))))

(defn score-tokens
  "tokens - `java.util.List`

  returns: `double`"
  (^Double [^SWN3 this ^java.util.List tokens]
    (-> this (.scoreTokens tokens))))

(defn extract
  "word - `java.lang.String`

  returns: `java.lang.Double`"
  (^java.lang.Double [^SWN3 this ^java.lang.String word]
    (-> this (.extract word))))

