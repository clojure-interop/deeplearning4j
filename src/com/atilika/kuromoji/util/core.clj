(ns com.atilika.kuromoji.util.core
  (:refer-clojure :only [require comment defn ->])
  (:import ))

(require '[com.atilika.kuromoji.util.DictionaryEntryLineParser])
(require '[com.atilika.kuromoji.util.FileResourceResolver])
(require '[com.atilika.kuromoji.util.KuromojiBinFilesFetcher])
(require '[com.atilika.kuromoji.util.ResourceResolver])
(require '[com.atilika.kuromoji.util.SimpleResourceResolver])
(require '[com.atilika.kuromoji.util.StringUtils])
(require '[com.atilika.kuromoji.util.UnknownDictionaryEntryParser])
