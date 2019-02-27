package com.example.demodagger2

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class MainActivityModule {
    @ContributesAndroidInjector
    abstract fun bindMyFragment(): MyFragment

    @ContributesAndroidInjector
    abstract fun bindMyDialogFragment(): MyDialogFragment
}