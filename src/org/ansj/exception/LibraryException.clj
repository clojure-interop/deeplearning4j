(ns org.ansj.exception.LibraryException
  (:refer-clojure :only [require comment defn ->])
  (:import [org.ansj.exception LibraryException]))

(defn ->library-exception
  "Constructor.

  e - `java.lang.Exception`"
  (^LibraryException [^java.lang.Exception e]
    (new LibraryException e)))

