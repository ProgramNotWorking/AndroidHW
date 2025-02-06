## Задача1: Реализовать механиз навигации между 3-мя экранами на базе фрагментов (весь код лежит [здесь](https://github.com/ProgramNotWorking/AndroidHW/tree/master/app/src/main/java/com/example/androidhw/task1))
`Base`:
* [BackActionHandler](https://github.com/ProgramNotWorking/AndroidHW/blob/master/app/src/main/java/com/example/androidhw/task1/base/BackActionHandler.kt) - интерфейс для обработки навигации "назад"
* [BaseFragment](https://github.com/ProgramNotWorking/AndroidHW/blob/master/app/src/main/java/com/example/androidhw/task1/base/BaseFragment.kt) - базовый фрагмент
* [BaseNavigationActivity](https://github.com/ProgramNotWorking/AndroidHW/blob/master/app/src/main/java/com/example/androidhw/task1/base/BaseFragment.kt) - активность для данной задачи
* [FragmentNavigationConstants](https://github.com/ProgramNotWorking/AndroidHW/blob/master/app/src/main/java/com/example/androidhw/task1/base/FragmentNavigationConstants.kt) - константы для навигации
* [NavigationDestination](https://github.com/ProgramNotWorking/AndroidHW/blob/master/app/src/main/java/com/example/androidhw/task1/base/NavigationDestination.kt) - sealed класс для определения точки навигации
* [NavigationFragment](https://github.com/ProgramNotWorking/AndroidHW/blob/master/app/src/main/java/com/example/androidhw/task1/base/NavigationFragment.kt) - абстрактный класс, предоставляющий функцию навигации
* [NavigationManager](https://github.com/ProgramNotWorking/AndroidHW/blob/master/app/src/main/java/com/example/androidhw/task1/base/NavigationManager.kt) - класс, содержащий реализацию навигации между экранами

`Fragments`:
* [Здесь](https://github.com/ProgramNotWorking/AndroidHW/tree/master/app/src/main/java/com/example/androidhw/task1/fragments) содержатся фрагменты для данной задачи

## Задача2: Один раз запланировать WorkManager, который будет присылать уведомление о том, что устройство находится на зарядке

## Задача3: Реализовать небольшую кастомную вью в виде прямоугольника. При каждом нажатии на него он заполняется на 10%, цвет залитой части рандомно меняется. При достижении 100% все начинается заново.
* [AcitivityForCustomView](https://github.com/ProgramNotWorking/AndroidHW/blob/master/app/src/main/java/com/example/androidhw/task3/ActivityForCustomView.kt) - активность в которой лежит вьюха
* [TouchFilledView](https://github.com/ProgramNotWorking/AndroidHW/blob/master/app/src/main/java/com/example/androidhw/task3/TouchFilledView.kt) - кастомная вьюха из задачи
