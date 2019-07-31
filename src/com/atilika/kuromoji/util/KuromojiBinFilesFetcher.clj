(ns com.atilika.kuromoji.util.KuromojiBinFilesFetcher
  "Created by kepricon on 16. 11. 24."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.atilika.kuromoji.util KuromojiBinFilesFetcher]))

(defn *get-kuromoji-root
  "returns: `java.io.File`"
  (^java.io.File []
    (KuromojiBinFilesFetcher/getKuromojiRoot )))

(defn *kuromoji-exist
  "returns: `boolean`"
  (^Boolean []
    (KuromojiBinFilesFetcher/kuromojiExist )))

(defn *download-and-untar
  "returns: `java.io.File`

  throws: java.io.IOException"
  (^java.io.File []
    (KuromojiBinFilesFetcher/downloadAndUntar )))

