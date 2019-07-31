(ns com.atilika.kuromoji.ipadic.Tokenizer$Builder
  "Builder class for creating a customized tokenizer instance"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.atilika.kuromoji.ipadic Tokenizer$Builder]))

(defn ->builder
  "Constructor.

  Creates a default builder"
  (^Tokenizer$Builder []
    (new Tokenizer$Builder )))

(defn mode
  "Sets the tokenization mode

  The tokenization mode defines how Available modes are as follows:

  TokenizerBase.Mode.NORMAL - The default mode
  TokenizerBase.Mode.SEARCH - Uses a heuristic to segment compound nouns (複合名詞) into their parts
  TokenizerBase.Mode.EXTENDED - Same as SEARCH, but emits unigram tokens for unknown terms

  See kanjiPenalty and otherPenalty for how to adjust costs used by SEARCH and EXTENDED mode

  mode - tokenization mode - `com.atilika.kuromoji.TokenizerBase$Mode`

  returns: this builder, not null - `com.atilika.kuromoji.ipadic.Tokenizer$Builder`"
  (^com.atilika.kuromoji.ipadic.Tokenizer$Builder [^Tokenizer$Builder this ^com.atilika.kuromoji.TokenizerBase$Mode mode]
    (-> this (.mode mode))))

(defn kanji-penalty
  "Sets a custom kanji penalty

  This is an expert feature used with TokenizerBase.Mode.SEARCH and TokenizerBase.Mode.EXTENDED modes that sets a length threshold and an additional costs used when running the Viterbi search.
  The additional cost is applicable for kanji candidate tokens longer than the length threshold specified.

  This is an expert feature and you usually would not need to change this.

  length-threshold - length threshold applicable for this penalty - `int`
  penalty - cost added to Viterbi nodes for long kanji candidate tokens - `int`

  returns: this builder, not null - `com.atilika.kuromoji.ipadic.Tokenizer$Builder`"
  (^com.atilika.kuromoji.ipadic.Tokenizer$Builder [^Tokenizer$Builder this ^Integer length-threshold ^Integer penalty]
    (-> this (.kanjiPenalty length-threshold penalty))))

(defn other-penalty
  "Sets a custom non-kanji penalty

  This is an expert feature used with TokenizerBase.Mode.SEARCH and TokenizerBase.Mode.EXTENDED modes that sets a length threshold and an additional costs used when running the Viterbi search.
  The additional cost is applicable for non-kanji candidate tokens longer than the length threshold specified.

  This is an expert feature and you usually would not need to change this.

  length-threshold - length threshold applicable for this penalty - `int`
  penalty - cost added to Viterbi nodes for long non-kanji candidate tokens - `int`

  returns: this builder, not null - `com.atilika.kuromoji.ipadic.Tokenizer$Builder`"
  (^com.atilika.kuromoji.ipadic.Tokenizer$Builder [^Tokenizer$Builder this ^Integer length-threshold ^Integer penalty]
    (-> this (.otherPenalty length-threshold penalty))))

(defn is-split-on-nakaguro
  "Predictate that splits unknown words on the middle dot character (U+30FB KATAKANA MIDDLE DOT)

  This feature is off by default.
  This is an expert feature sometimes used with TokenizerBase.Mode.SEARCH and TokenizerBase.Mode.EXTENDED mode.

  split - predicate to indicate split on middle dot - `boolean`

  returns: this builder, not null - `com.atilika.kuromoji.ipadic.Tokenizer$Builder`"
  (^com.atilika.kuromoji.ipadic.Tokenizer$Builder [^Tokenizer$Builder this ^Boolean split]
    (-> this (.isSplitOnNakaguro split))))

(defn build
  "Creates the custom tokenizer instance

  returns: tokenizer instance, not null - `com.atilika.kuromoji.ipadic.Tokenizer`"
  (^com.atilika.kuromoji.ipadic.Tokenizer [^Tokenizer$Builder this]
    (-> this (.build))))

