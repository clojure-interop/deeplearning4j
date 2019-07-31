(ns com.atilika.kuromoji.ipadic.compile.TokenInfoDictionaryCompiler
  (:refer-clojure :only [require comment defn ->])
  (:import [com.atilika.kuromoji.ipadic.compile TokenInfoDictionaryCompiler]))

(defn ->token-info-dictionary-compiler
  "Constructor.

  encoding - `java.lang.String`"
  (^TokenInfoDictionaryCompiler [^java.lang.String encoding]
    (new TokenInfoDictionaryCompiler encoding)))

(defn extract-pos-features
  "entry - `com.atilika.kuromoji.ipadic.compile.DictionaryEntry`

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^TokenInfoDictionaryCompiler this ^com.atilika.kuromoji.ipadic.compile.DictionaryEntry entry]
    (-> this (.extractPosFeatures entry))))

(defn extract-other-features
  "entry - `com.atilika.kuromoji.ipadic.compile.DictionaryEntry`

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^TokenInfoDictionaryCompiler this ^com.atilika.kuromoji.ipadic.compile.DictionaryEntry entry]
    (-> this (.extractOtherFeatures entry))))

