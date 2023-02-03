import { useState } from "react";
import { StyleSheet, TextInput, View, Button, Modal} from "react-native";

function GoalInput(props){
    const [enteredGoalText, setEnteredGoalText]= useState('');

    function goalInputHandler(enteredText){
        setEnteredGoalText(enteredText);
      };
    function addGoalHandler(){
        props.goalFunction(enteredGoalText);
        setEnteredGoalText('');
    }

     return(<Modal visible={props.visible} animationType="slide">
        <View style={styles.inputContainer}>
        <TextInput style={styles.textInput} placeholder='Your course goal!' onChangeText={goalInputHandler}/>
        
        <View style={styles.buttonContainer}>
        <View style={styles.button}>
        <Button title='Add Goal' onPress={addGoalHandler} value={enteredGoalText} />
        </View>
        <View style={styles.button}><Button title='Cancel' onPress={props.cancel} /></View>
        </View>
        </View>
     </Modal>);
}

export default GoalInput;

const styles=StyleSheet.create({
    inputContainer:{
        flex:1,
        // flexDirection:'column',
        justifyContent: 'center',
        alignItems:'center',
        marginBottom:24,
        borderWidth:1,
        padding:16,
        borderColor:'#cccccc'
       },
       textInput:{
        borderWidth:1,
        borderColor:'#cccccc',
        width:'100%',
        padding:8
       },
       buttonContainer:{
        marginTop:16,
        flexDirection: 'row'
       },
       button:{
        width:100,
        marginHorizontal:8
       }
})