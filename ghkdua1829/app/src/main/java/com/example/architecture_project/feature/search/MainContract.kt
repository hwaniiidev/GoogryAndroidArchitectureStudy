package com.example.architecture_project.feature.search

import com.example.architecture_project.data.model.NaverApi

interface MainContract {
    interface View {
        fun noShowResult()
        fun notAvailableKeyword()
        fun showResult(data:NaverApi)
        fun noKeyword()
    }

    interface Presenter {
        fun getMovieData(keyword: String)
    }
}