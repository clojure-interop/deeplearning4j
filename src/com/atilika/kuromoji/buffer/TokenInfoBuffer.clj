(ns com.atilika.kuromoji.buffer.TokenInfoBuffer
  (:refer-clojure :only [require comment defn ->])
  (:import [com.atilika.kuromoji.buffer TokenInfoBuffer]))

(defn ->token-info-buffer
  "Constructor.

  is - `java.io.InputStream`

  throws: java.io.IOException"
  (^TokenInfoBuffer [^java.io.InputStream is]
    (new TokenInfoBuffer is)))

(defn lookup-entry
  "offset - `int`

  returns: `com.atilika.kuromoji.buffer.BufferEntry`"
  (^com.atilika.kuromoji.buffer.BufferEntry [^TokenInfoBuffer this ^Integer offset]
    (-> this (.lookupEntry offset))))

(defn lookup-token-info
  "offset - `int`
  i - `int`

  returns: `int`"
  (^Integer [^TokenInfoBuffer this ^Integer offset ^Integer i]
    (-> this (.lookupTokenInfo offset i))))

(defn lookup-part-of-speech-feature
  "offset - `int`
  i - `int`

  returns: `int`"
  (^Integer [^TokenInfoBuffer this ^Integer offset ^Integer i]
    (-> this (.lookupPartOfSpeechFeature offset i))))

(defn lookup-feature
  "offset - `int`
  i - `int`

  returns: `int`"
  (^Integer [^TokenInfoBuffer this ^Integer offset ^Integer i]
    (-> this (.lookupFeature offset i))))

(defn part-of-speech-feature?
  "i - `int`

  returns: `boolean`"
  (^Boolean [^TokenInfoBuffer this ^Integer i]
    (-> this (.isPartOfSpeechFeature i))))

