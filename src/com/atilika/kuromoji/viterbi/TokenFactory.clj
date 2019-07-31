(ns com.atilika.kuromoji.viterbi.TokenFactory
  (:refer-clojure :only [require comment defn ->])
  (:import [com.atilika.kuromoji.viterbi TokenFactory]))

(defn create-token
  "word-id - `int`
  surface - `java.lang.String`
  type - `com.atilika.kuromoji.viterbi.ViterbiNode$Type`
  position - `int`
  dictionary - `com.atilika.kuromoji.dict.Dictionary`

  returns: `T`"
  ([^TokenFactory this ^Integer word-id ^java.lang.String surface ^com.atilika.kuromoji.viterbi.ViterbiNode$Type type ^Integer position ^com.atilika.kuromoji.dict.Dictionary dictionary]
    (-> this (.createToken word-id surface type position dictionary))))

