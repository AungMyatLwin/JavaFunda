import { useState } from "react";
import { StyleSheet, TextInput, View, Button} from "react-native";

function GoalInput(props){
    const [enteredGoalText, setEnteredGoalText]= useState('');

    function goalInputHandler(enteredText){
        setEnteredGoalText(enteredText);
      };
    function addGoalHandler(){
        props.goalFunction(enteredGoalText);
        setEnteredGoalText('');
    }

     return(<View style={styles.inputContainer}>
        <TextInput style={styles.textInput} placeholder='Your course goal!' onChangeText={goalInputHandler}/>
        <Button title='Add Goal' onPress={addGoalHandler} value={enteredGoalText} />
       </View>);
}

export default GoalInput;

const styles=StyleSheet.create({
    inputContainer:{
        flex:1,
        flexDirection:'row',
        justifyContent: 'space-between',
        alignItems:'center',
        marginBottom:24,
        borderWidth:1,
        borderColor:'#cccccc'
       },
       textInput:{
        borderWidth:1,
        borderColor:'#cccccc',
        width:'60%',
        marginRight:8,
        padding:8
       }
})