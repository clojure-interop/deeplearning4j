(ns com.atilika.kuromoji.ipadic.Token
  "IPADIC token produced by the IPADIC tokenizer with various morphological features"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.atilika.kuromoji.ipadic Token]))

(defn ->token
  "Constructor.

  word-id - `int`
  surface - `java.lang.String`
  type - `com.atilika.kuromoji.viterbi.ViterbiNode$Type`
  position - `int`
  dictionary - `com.atilika.kuromoji.dict.Dictionary`"
  (^Token [^Integer word-id ^java.lang.String surface ^com.atilika.kuromoji.viterbi.ViterbiNode$Type type ^Integer position ^com.atilika.kuromoji.dict.Dictionary dictionary]
    (new Token word-id surface type position dictionary)))

(defn get-base-form
  "Gets the base form (also called dictionary form) for this token (基本形)

  returns: base form, not null - `java.lang.String`"
  (^java.lang.String [^Token this]
    (-> this (.getBaseForm))))

(defn get-part-of-speech-level-2
  "Gets the 2nd level part-of-speech tag for this token (品詞細分類2)

  returns: 2nd level part-of-speech tag, not null - `java.lang.String`"
  (^java.lang.String [^Token this]
    (-> this (.getPartOfSpeechLevel2))))

(defn get-part-of-speech-level-1
  "Gets the 1st level part-of-speech tag for this token (品詞細分類1)

  returns: 1st level part-of-speech tag, not null - `java.lang.String`"
  (^java.lang.String [^Token this]
    (-> this (.getPartOfSpeechLevel1))))

(defn get-reading
  "Gets the reading for this token (読み) in katakana script

  returns: reading, not null - `java.lang.String`"
  (^java.lang.String [^Token this]
    (-> this (.getReading))))

(defn get-conjugation-type
  "Gets the conjugation type for this token (活用型), if applicable

  If this token does not have a conjugation type, return *

  returns: conjugation type, not null - `java.lang.String`"
  (^java.lang.String [^Token this]
    (-> this (.getConjugationType))))

(defn get-conjugation-form
  "Gets the conjugation form for this token (活用形), if applicable

  If this token does not have a conjugation form, return *

  returns: conjugation form, not null - `java.lang.String`"
  (^java.lang.String [^Token this]
    (-> this (.getConjugationForm))))

(defn get-pronunciation
  "Gets the pronunciation for this token (発音)

  returns: pronunciation, not null - `java.lang.String`"
  (^java.lang.String [^Token this]
    (-> this (.getPronunciation))))

(defn get-part-of-speech-level-3
  "Gets the 3rd level part-of-speech tag for this token (品詞細分類3)

  returns: 3rd level part-of-speech tag, not null - `java.lang.String`"
  (^java.lang.String [^Token this]
    (-> this (.getPartOfSpeechLevel3))))

(defn get-part-of-speech-level-4
  "Gets the 4th level part-of-speech tag for this token (品詞細分類4)

  returns: 4th level part-of-speech tag, not null - `java.lang.String`"
  (^java.lang.String [^Token this]
    (-> this (.getPartOfSpeechLevel4))))

