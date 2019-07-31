(ns org.deeplearning4j.text.inputsanitation.InputHomogenization
  "Performs some very basic textual transformations
 such as word shape, lower casing, and stripping of punctuation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.text.inputsanitation InputHomogenization]))

(defn ->input-homogenization
  "Constructor.

  Input text to applyTransformToOrigin

  input - the input text to applyTransformToOrigin,equivalent to calling this(input,false)wrt preserving case - `java.lang.String`"
  (^InputHomogenization [^java.lang.String input]
    (new InputHomogenization input))
  (^InputHomogenization [^java.lang.String input ^Boolean preserve-case]
    (new InputHomogenization input preserve-case)))

(defn transform
  "Returns the normalized text passed in via constructor

  returns: the normalized text passed in via constructor - `java.lang.String`"
  (^java.lang.String [^InputHomogenization this]
    (-> this (.transform))))

